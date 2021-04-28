package com.tyss.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.tyss.springcoreannotations.Employee;

@Configuration
public class EmployeeConfig2 {
	@Bean
	public Employee getEmp() {
		Employee employee=new Employee();
		employee.setId(100);
		employee.setName("Hemadri");
		return employee;
	}

}
