package org.cts.dao;

import org.cts.model.Emp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	SessionFactory factory;
	

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void insert(Emp e) {
		Session session=factory.openSession();
		session.save(e);
	}

	@Override
	public Emp get(int id) {
		Session session=factory.openSession();
		Emp e=session.get(Emp.class, id);
		return e;
	}

}
