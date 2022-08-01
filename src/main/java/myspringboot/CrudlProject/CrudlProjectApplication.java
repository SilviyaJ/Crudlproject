package myspringboot.CrudlProject;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class CrudlProjectApplication {
	
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	ResourceService service;
	
	

	public static void main(String[] args) {
		SpringApplication.run(CrudlProjectApplication.class, args);
		
		
	}
	@PostConstruct
	public void jes() {
		Resource res= new Resource();
		
//		res.setEmpName("sweety");res.setEmail("silviyaj22@gmail.com");
//		res.setMobile(897856235L);res.setUsername("sil");res.setPassword(encoder.encode("praba"));
//		service.implementSave(res);
	}

}
