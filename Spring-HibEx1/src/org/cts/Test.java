package org.cts;

import org.cts.config.AppConfig;
import org.cts.model.Emp;
import org.cts.service.EmpService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService service=(EmpService)context.getBean("empService");
		service.insertEmp(new Emp("ramana", "hyd"));
		
	}

}
