package com.tyss.springcoresir.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Car implements Serializable {
	
	private String company;
	
	@Autowired(required = false)
	private Engine engine;
}
