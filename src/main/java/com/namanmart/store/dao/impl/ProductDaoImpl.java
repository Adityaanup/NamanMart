package com.namanmart.store.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.namanmart.store.dao.ProductDao;
import com.namanmart.store.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Product loadProductById(int productId) {
		
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, productId);
        session.flush();

        return product;
	}

}
