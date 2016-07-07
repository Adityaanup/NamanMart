package com.namanmart.store.dao;

import com.namanmart.store.model.Product;

public interface ProductDao {
	
	Product loadProductById(int productId);

}
