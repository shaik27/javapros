package org.cts.dao;

import org.cts.beans.Emp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Integer insert(Emp e) {
		Session session=sessionFactory.openSession();
		Integer i=(Integer)session.save(e);
		return i;
	}

}
