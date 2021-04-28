package com.tyss.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.tyss.springcoreannotations.Employee;

@Configuration
public class EmployeeConfig {
	@Bean
	// @Primary
	public Employee getEmployee() {
		return new Employee();
	}

	@Bean
	@Primary
	public Employee getEmp() {
		return new Employee(100, "shashank", null);
	}
	@Bean
	public Employee getEmployee2() {
		Employee emp=new Employee();
		emp.setId(200);
		emp.setName("omk");
		return emp;
	}
}
