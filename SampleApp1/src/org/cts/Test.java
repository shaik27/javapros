package org.cts;

import org.cts.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService service=(EmpService)context.getBean("empService");
		System.out.println(service.getMessage());
		
	}

}
