package com.tyss.springcoresir;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcoresir.bean.Car;

public class CarTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("carconfig.xml");
		
		Car car=context.getBean("car", Car.class);
		System.out.println(car);
	}
}
