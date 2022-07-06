package myspringboot.CrudlProject;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepo extends CrudRepository<Laptop, Integer>{
        public Optional<Laptop> findByBrand(String brand);
        public List<Laptop> findAllByModel(String model);
        
        @Transactional
        @Modifying
        @Query ("delete from Laptop where model like %:own%")
        public void deleteAllByCustomise(String own);
        
        @Query("select brand from Laptop where model like %:tp%")
        public List<String> findAllByTypesLikes(String tp);
        
        @Transactional
        @Modifying
        @Query ("update Laptop set cost=cost*0.500 where brand=:bnnd")
        public void updatePriceByBrand (String bnnd);
        
        
        @Query ("from Laptop where brand=:bnd and size>=:in")
        public List<Laptop> findAllByBrandAndSize(String bnd,double in);
        
        @Query ("select brand from Laptop where model=:gen")
        public List<String> findAllByTypes(String gen);
        
}
