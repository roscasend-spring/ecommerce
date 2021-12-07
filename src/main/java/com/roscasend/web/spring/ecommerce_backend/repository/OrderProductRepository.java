package com.roscasend.web.spring.ecommerce_backend.repository;

import com.roscasend.web.spring.ecommerce_backend.model.OrderProduct;
import com.roscasend.web.spring.ecommerce_backend.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}