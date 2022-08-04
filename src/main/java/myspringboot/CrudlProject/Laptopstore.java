package myspringboot.CrudlProject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin (origins ="http://localhost:3000")
@RestController
public class Laptopstore {
 
	@Autowired
	Laptopservice service;
	
    @Autowired
    PasswordEncoder encoder;
	
	@Autowired
	ResourceService serv;
	
	@PostMapping("/signup")
	public Resource signingUp(@RequestBody Resource resource) {
		
		String newone=encoder.encode(resource.getPassword());
		resource.setPassword(newone);
		return serv.implementSave(resource);
		
	}
	
	@DeleteMapping("/delall/{tp}")
	public List<String> callingDeleteMany(@PathVariable("tp") String tp){
		return service.makeDeleteCustom(tp);
	}
	
	@DeleteMapping("/delid/{ind}")
	public String callingDeleteById(@PathVariable("ind") int ind) {
		return service.makeDeleteKey(ind);
	}
	
	@PutMapping("/up/{send}")
	public void callingUpdateByPrice(@PathVariable("send") String send) {
		service.makeUpdate(send);
	}
	
	@PutMapping("/up")
	public Laptop callingUpdate (@RequestBody Laptop lapt) {
		 return service.makenew(lapt);
	}
	
	@DeleteMapping("/del")
	public String callingDelete(@RequestBody Laptop lp){
		return service.makeDelete(lp);
	}
	
	@GetMapping("/bygen/{will}")
	public List<String> callingReadMod(@PathVariable ("will") String will){
		return service.makeReadByType(will);
	}
	 
	@GetMapping("/bytwo/{one}/{two}")
	public List<Laptop> callingReadTwo(@PathVariable("one") String one,@PathVariable("two") double two){
		return service.makeReadBrandAndSize(one, two);
	}
	
	@GetMapping("/bymodel/{hell}")
	public List<Laptop> callingReadModel(@PathVariable("hell") String hell){
		return service.makeReadModeL(hell);
	}
	
	@GetMapping("/bybrand/{hell}")
	public Optional<Laptop> callingReadBrand(@PathVariable("hell") String hell){
		return service.makeReadBrand(hell);
	}
	
	@GetMapping("/")
	public List<Laptop> callingOrder(){
		return service.makeFetchAll();
		
	}
	
	@PostMapping("/new")
	public Laptop callingCreate (@RequestBody Laptop lapt) {
		 return service.makenew(lapt);
	}
}
