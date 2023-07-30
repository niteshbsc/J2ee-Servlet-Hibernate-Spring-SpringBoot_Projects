package org.jsp.userbootdemo.repository;

import org.jsp.userbootdemo.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Integer> {



}
