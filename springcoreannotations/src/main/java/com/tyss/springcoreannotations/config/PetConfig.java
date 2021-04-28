package com.tyss.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.tyss.springcoreannotations.Pet;
@Import({AnimalConfig.class})
@Configuration
public class PetConfig {
	@Bean
	public Pet getPetObject() {
		Pet pet=new Pet();
		pet.setName("rickey");
		return pet;
	}
}
