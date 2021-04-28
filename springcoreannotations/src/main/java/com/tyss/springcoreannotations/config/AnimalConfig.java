package com.tyss.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.tyss.springcoreannotations.Interface.Animal;
import com.tyss.springcoreannotations.Interface.Dog;
import com.tyss.springcoreannotations.Interface.Horse;

@Configuration
public class AnimalConfig {
	@Bean
	@Primary
	public Animal getDog() {
		return new Dog();
	}

	@Bean
	// @Primary
	public Animal getHorse() {
		return new Horse();
	}

}
