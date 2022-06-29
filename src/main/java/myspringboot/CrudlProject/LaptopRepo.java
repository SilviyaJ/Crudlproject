package myspringboot.CrudlProject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends CrudRepository<Laptop, Integer>{

}
