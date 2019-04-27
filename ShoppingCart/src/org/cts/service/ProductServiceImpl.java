package org.cts.service;

import java.util.List;

import org.cts.beans.Product;
import org.cts.dao.ProductDao;
import org.cts.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	ProductDao	dao=new ProductDaoImpl();
	@Override
	public boolean addProduct(Product product) {
		boolean b=dao.insertProduct(product);
		return b;
	}
	@Override
	public List<Product> getProducts() {
		List<Product> products=dao.getAll();
		return products;
	}

}
