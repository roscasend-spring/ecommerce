package com.roscasend.web.spring.ecommerce_backend.repository;

import com.roscasend.web.spring.ecommerce_backend.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
