package com.tyss.springcoreannotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcoreannotations.Employee;
import com.tyss.springcoreannotations.config.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp=context.getBean(Employee.class);
		
		System.out.println(emp);
	}

}
