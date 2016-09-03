package com.namanmart.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namanmart.store.dao.ProductDao;
import com.namanmart.store.model.Product;
import com.namanmart.store.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao; 

	public List<Product> getProductList() {
		return productDao.loadProductList();
	}
	
	public Product getProductById(int productId) {
		return productDao.loadProductById(productId);
	}

	public void addProduct(Product product) {
		productDao.insertProduct(product);
	}

	public void editProduct(Product product) {
		productDao.modifyProduct(product);
	}

	public void removeProduct(Product product) {
		productDao.deleteProduct(product);
	}

}
