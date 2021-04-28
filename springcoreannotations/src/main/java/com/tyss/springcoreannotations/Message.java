package com.tyss.springcoreannotations;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.management.loading.PrivateClassLoader;

import lombok.Data;
@Data
public class Message implements Serializable {

	public Message() {
		System.out.println("Instantiation phaes");
	}
	
	private String msg;
	
	@PostConstruct
	private void init() {
		System.out.println("init");
	}
	@PreDestroy
	private void destroy() {
		System.out.println("dest");
	}
	
}
