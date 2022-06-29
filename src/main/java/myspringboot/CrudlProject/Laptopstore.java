package myspringboot.CrudlProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptopstore {
 
	@Autowired
	Laptopservice service;
	
	@PostMapping("/new")
	public Laptop callingCreate (@RequestBody Laptop lapt) {
		 return service.makenew(lapt);
	}
}
