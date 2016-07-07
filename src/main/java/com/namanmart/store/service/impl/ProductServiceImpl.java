package com.namanmart.store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namanmart.store.dao.ProductDao;
import com.namanmart.store.model.Product;
import com.namanmart.store.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao; 

	public Product getProductById(int productId) {
		
		return productDao.loadProductById(productId);
	}

}
