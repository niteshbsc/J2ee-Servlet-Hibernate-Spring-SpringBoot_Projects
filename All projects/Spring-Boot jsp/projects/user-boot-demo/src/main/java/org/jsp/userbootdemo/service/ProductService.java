package org.jsp.userbootdemo.service;

import java.util.List;
import java.util.Optional;

import org.jsp.userbootdemo.dao.ProductDao;
import org.jsp.userbootdemo.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductDao dao1;
	
	public ResponseStructure<Product> saveProduct(Product product) {
		ResponseStructure<Product> structure= new ResponseStructure<Product>();
		structure.setMessage("Product save succesfully");
		structure.setBody(dao1.saveProduct(product));
		structure.setCode(HttpStatus.ACCEPTED.value());
		return structure;
	}
	public ResponseStructure<Product> updateProduct(Product product) {
		ResponseStructure<Product> structure= new ResponseStructure<Product>();
		structure.setMessage("Product Update succesfully");
		structure.setBody(dao1.updateProduct(product));
		structure.setCode(HttpStatus.ACCEPTED.value());
		return structure;
	}
	public ResponseStructure<Product> findProduct(int id) {
		ResponseStructure<Product> structure= new ResponseStructure<Product>();
		Optional<Product> recProduct= dao1.findProduct(id);
		if(recProduct.isPresent()) {
			structure.setBody(recProduct.get());
			structure.setMessage("Product Found");
			structure.setCode(HttpStatus.OK.value());
			return structure;
		}
		structure.setBody(null);
		structure.setMessage("Product Not Found");
		structure.setCode(HttpStatus.NOT_FOUND.value());
		return structure;
	}
	public ResponseStructure<List<Product>> finAll() {
		ResponseStructure<List<Product>> structure= new ResponseStructure <List<Product>>();
			structure.setBody(dao1.findAll());
			structure.setMessage("All the Product are Displayed");
			structure.setCode(HttpStatus.OK.value());
			return structure;
		}
	public ResponseStructure<String> deleteProduct(int id) {
		ResponseStructure<String> structure= new ResponseStructure<String>();
		Optional<Product> recProduct= dao1.findProduct(id);
		if(recProduct.isPresent()) {
			dao1.deleteProduct(id);
			structure.setBody("Product Deleted");
			structure.setMessage("User Found");
			structure.setCode(HttpStatus.OK.value());
			return structure;
		}
		structure.setBody("Product not deleted");
		structure.setMessage("Product Not Found");
		structure.setCode(HttpStatus.NOT_FOUND.value());
		return structure;
	}
}
