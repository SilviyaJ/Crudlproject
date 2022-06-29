package myspringboot.CrudlProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Laptopservice {
    
	@Autowired
	LaptopRepo obj;
	
	public Laptop makenew(Laptop lap) {
		return obj.save(lap);
		
	}
}
