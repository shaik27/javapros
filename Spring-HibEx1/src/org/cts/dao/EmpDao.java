package org.cts.dao;

import org.cts.model.Emp;



public interface EmpDao {
	void insert(Emp e);
	Emp get(int id);
}
