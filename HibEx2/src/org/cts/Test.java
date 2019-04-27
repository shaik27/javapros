package org.cts;

import org.cts.entity.Computer;
import org.cts.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		
		Computer computer=new Computer(101, "ibm");
		Person person=new Person(1, "ram", "chennai");
		person.setComputer(computer);
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		session.save(person);
		
		session.close();

	}

}
