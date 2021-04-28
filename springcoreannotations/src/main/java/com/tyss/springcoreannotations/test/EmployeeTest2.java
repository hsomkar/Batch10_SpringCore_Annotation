package com.tyss.springcoreannotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcoreannotations.Employee;
import com.tyss.springcoreannotations.config.AllConfig;

public class EmployeeTest2 {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AllConfig.class);
		Employee emp=context.getBean(Employee.class);
		
		System.out.println(emp);
	}

}
