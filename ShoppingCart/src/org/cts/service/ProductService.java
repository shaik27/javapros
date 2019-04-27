package org.cts.service;

import java.util.List;

import org.cts.beans.Product;

public interface ProductService {
	boolean addProduct(Product product);
	List<Product> getProducts();
}
