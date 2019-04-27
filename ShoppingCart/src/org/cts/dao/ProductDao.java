package org.cts.dao;

import java.util.List;

import org.cts.beans.Product;

public interface ProductDao {
	boolean insertProduct(Product product);
	List<Product> getAll();
}
