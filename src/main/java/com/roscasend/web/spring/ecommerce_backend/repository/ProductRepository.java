package com.roscasend.web.spring.ecommerce_backend.repository;

import com.roscasend.web.spring.ecommerce_backend.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
