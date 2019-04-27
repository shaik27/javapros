package org.cts;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpDao {
	
	public void insert(Emp e)
	{
		Transaction tx=null;
		try
		{
		Session session=HibUtil.getSessionFactory().openSession();
		tx=session.beginTransaction();
		session.save(e);
		tx.commit();
		System.out.println("inserted");
		}
		catch(Exception e1)
		{
			tx.rollback();
		}
	}
	public Emp get(int id)
	{
		Transaction tx=null;
		Session session=null;
		Emp e1=null;
		try {
			session=HibUtil.getSessionFactory().openSession();
			tx=session.beginTransaction();
			e1=session.get(Emp.class, id);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return e1;
	}
	public List<Emp> getAll()
	{
		Transaction tx=null;
		Session session=null;
		List<Emp> emps=null;
		try {
			session=HibUtil.getSessionFactory().openSession();
			tx=session.beginTransaction();
			Query query=session.createQuery("from org.cts.Emp e");
			emps=query.list();
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emps;
	}

}
