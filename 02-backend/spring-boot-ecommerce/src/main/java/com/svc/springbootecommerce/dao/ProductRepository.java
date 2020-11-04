package com.svc.springbootecommerce.dao;

import com.svc.springbootecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {
    // queryMethod to return products based on given categoryId
    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
    // queryMethod to return products based on entered Search keyword
    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

}
