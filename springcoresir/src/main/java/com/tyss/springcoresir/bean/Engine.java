package com.tyss.springcoresir.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Engine implements Serializable {

	private int cc;
	
	private String type;

}
