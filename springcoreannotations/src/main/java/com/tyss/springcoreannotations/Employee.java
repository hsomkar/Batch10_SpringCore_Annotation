package com.tyss.springcoreannotations;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee implements Serializable {
	
	private int id;
	private String name;
	@Autowired(required = false)
	@Qualifier("dev")
	private Department department;
	public Employee() {
	}

}
