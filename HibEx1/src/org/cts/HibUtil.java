package org.cts;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibUtil {
	private static StandardServiceRegistry registry=null;
	private static SessionFactory factory=null;
	public static SessionFactory getSessionFactory()
	{
		if(factory==null)
		{
			Configuration configuration=new Configuration();
			Properties properties=new Properties();
			properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/employees");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			properties.put(Environment.SHOW_SQL, true);
			properties.put(Environment.HBM2DDL_AUTO, "update");
			configuration.setProperties(properties);
			configuration.addAnnotatedClass(Emp.class);
			StandardServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			factory=configuration.buildSessionFactory(registry);
		}
		return factory;
	}

}
