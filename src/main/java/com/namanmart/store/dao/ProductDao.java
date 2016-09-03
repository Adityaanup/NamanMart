package com.namanmart.store.dao;

import java.util.List;

import com.namanmart.store.model.Product;

public interface ProductDao {
	
	List<Product> loadProductList();
	Product loadProductById(int productId);
	void insertProduct(Product product);
	void modifyProduct(Product product);
	void deleteProduct(Product product);
}
