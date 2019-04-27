package org.cts;

import org.cts.beans.Emp;
import org.cts.service.EmpService;
import org.cts.service.EmpServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Emp e1=new Emp(13, "vamsi", "chennai");
		EmpService service=context.getBean("service",EmpServiceImpl.class);
		boolean b=service.insert(e1);
		System.out.println(b);
		
	}

}
