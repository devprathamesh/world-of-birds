package dev.prathamesh.worldofbirds.repository;

import dev.prathamesh.worldofbirds.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer>{
        public Product findByType(String type);
        public Product findByName(String name);
        public List<Product> findByTypeAndSector(String type, String sector);
}
