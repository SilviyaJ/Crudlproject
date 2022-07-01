package myspringboot.CrudlProject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Laptopservice {
    
	@Autowired
	LaptopRepo obj;
	
	public String makeDelete(Laptop lapto) {
		String msg=lapto.getBrand()+"has deleted";
		obj.delete(lapto);
		return msg;
	}
	
	public List<String> makeReadByType(String as){
		return obj.findAllByTypes(as);
	}
	
	public List<Laptop> makeReadBrandAndSize(String alpha,double beta){
		return obj.findAllByBrandAndSize(alpha, beta);
	}
	
	
	public List<Laptop> makeReadModeL(String gell){
		
		return obj.findAllByModel(gell);
	}
	
	
	public Optional<Laptop> makeReadBrand(String sell){
		return obj.findByBrand(sell);
		}
	
	
	
	//findById
	public Optional<Laptop> makeRead(int key){
		return obj.findById(key);
		
	}
	
	//findAll
	public List<Laptop> makeFetchAll(){
		return (List<Laptop>) obj.findAll();
		
	}
	
	
	//save
	public Laptop makenew(Laptop lap) {
		return obj.save(lap);
		
	}
}
