package org.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

	@Autowired
	EntityManager manager;
	
	public Product saveProduct(Product product) {
		EntityTransaction tx=manager.getTransaction();
     	manager.persist(product);
		tx.begin();
		tx.commit();
		return product;
	}
	public Product findProductById(int id) {
		return manager.find(Product.class, id);
	}
}
