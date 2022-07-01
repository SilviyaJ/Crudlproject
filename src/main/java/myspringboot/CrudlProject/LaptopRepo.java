package myspringboot.CrudlProject;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends CrudRepository<Laptop, Integer>{
        public Optional<Laptop> findByBrand(String brand);
        public List<Laptop> findAllByModel(String model);
        
        @Query ("from Laptop where brand=:bnd and size>=:in")
        public List<Laptop> findAllByBrandAndSize(String bnd,double in);
        
        @Query ("select brand from Laptop where model=:gen")
        public List<String> findAllByTypes(String gen);
        
}
