package com.tyss.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.tyss.springcoreannotations.Department;
import com.tyss.springcoreannotations.Employee;

@Configuration
public class DepartmentConfig {
	@Bean("dev")
	public Department getDept() {
		Department department=new Department();
		department.setId(10);
		department.setName("Dev");
		return department;
	}
	
	@Bean("hr")
	//@Primary
	public Department getDeptHr() {
		Department department=new Department();
		department.setId(20);
		department.setName("HR");
		return department;
	}
	
	@Bean("test")
	public Department getDeptTest() {
		Department department=new Department();
		department.setId(30);
		department.setName("testing");
		return department;
	}

}
