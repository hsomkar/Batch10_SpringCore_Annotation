package com.tyss.springcoreannotations;

import org.springframework.beans.factory.annotation.Autowired;

import com.tyss.springcoreannotations.Interface.Animal;

import lombok.Data;

@Data
public class Pet {
	
	private String name;
	@Autowired
	private Animal animal;
	
}
