package com.tyss.springcoreannotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcoreannotations.Pet;
import com.tyss.springcoreannotations.config.PetConfig;

public class PetTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet = context.getBean(Pet.class);
		pet.getAnimal().eat();
		pet.getAnimal().speak();

	}

}
