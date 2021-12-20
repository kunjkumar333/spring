package com.coforge.training.crud.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.training.crud.model.Product;



@Repository
public class ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	
	public void saveProduct(Product theProduct) {

	
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theProduct);
	
		
		

	}
	
	public List<Product> getProducts() {

		Session session = sessionFactory.getCurrentSession();
		// jpa queries -jpql
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class); // roots references entity
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList(); // fetch all records from Customer class using getters

	}
	
	public Product getProduct(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Product theProduct = currentSession.get(Product.class, theId);
		return theProduct;
	}

	public void deleteProduct(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
        Product c1=currentSession.byId(Product.class).load(theId);
        currentSession.delete(c1);
	}
}
