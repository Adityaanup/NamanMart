package com.namanmart.store.dao.impl;

import java.util.List;

import org.hibernate.Query;
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
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Product> loadProductList() {
		
		Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Product> productList = query.list();
        session.flush();

        return productList;
	}
	
	public Product loadProductById(int productId) {
		
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, productId);
        session.flush();

        return product;
	}

	public void insertProduct(Product product) {

		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
		
	}

	public void modifyProduct(Product product) {
		
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
		
	}

	public void deleteProduct(Product product) {
		
		Session session = sessionFactory.getCurrentSession();
        session.delete(product);
        session.flush();
	}

}
