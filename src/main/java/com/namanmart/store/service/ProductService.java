package com.namanmart.store.service;

import java.util.List;

import com.namanmart.store.model.Product;

public interface ProductService {

	List<Product> getProductList();
	Product getProductById(int productId);
	void addProduct(Product product);
	void editProduct(Product product);
	void removeProduct(Product product);
}
