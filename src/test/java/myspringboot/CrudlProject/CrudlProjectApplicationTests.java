package myspringboot.CrudlProject;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class CrudlProjectApplicationTests {
	
	@MockBean
	LaptopRepo repo;
	
	@Autowired
	Laptopservice service;
	
	@Test
	public void testing() {
		Laptop l1=new Laptop (45,"third generation","hp",15000,13.5);
		Laptop l2=new Laptop (47,"second generation","asus",16000,17.5);
		
		when(repo.findAll()).thenReturn(Stream.of(l1,l2).collect(Collectors.toList()));
		 assertSame(2,service.makeFetchAll().size());
		 assertNull(service.makeFetchAll().get(0));
	}

	@Test
	void contextLoads() {
	}

}
