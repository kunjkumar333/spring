package com.coforge.training.crud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.coforge.training.crud.dao.ProductDao;
import com.coforge.training.crud.model.Product;



@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	@Transactional
	public void saveProduct(Product theProduct) {
		// TODO Auto-generated method stub

		productDao.saveProduct(theProduct);
	}
	
	@Transactional
	public List<Product> getProducts() {
		
		return productDao.getProducts();
	}
	
	@Transactional
	public Product getProduct(int theId) {
		// TODO Auto-generated method stub
		return productDao.getProduct(theId);
	}


	@Transactional
	public void deleteProduct(int theId) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(theId);

	}

}
