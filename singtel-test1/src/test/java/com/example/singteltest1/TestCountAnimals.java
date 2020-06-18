package com.example.singteltest1;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCountAnimals {
	
	private static final Logger LOGGER = Logger.getLogger(TestCountAnimals.class.getName());
	@Test
	public void test() {
		int flyCount = 0;
		int walkCount = 0;
		int singCount = 0;
		int swimCount = 0;
		
		Animal[] animals = new Animal[] { new Duck(), new Chicken(), new Rooster(), new Parrot(), new Fish(),
				new Shark(), new ClownFish(), new Dog(), new Cat() };
		for (Animal animal : animals) {
			if (animal instanceof Bird && !((Bird) animal).fly().contentEquals("can't fly")) {
				flyCount++;
				
			}
			if(animal instanceof Animal && !(animal.walk().contains("Cannot Walk"))) {
				walkCount++;
				
			}
			if(animal instanceof Bird && !(((Bird) animal).sing().contains("Cannot sing"))) {
				singCount++;
			}
			if (animal instanceof Fish && !((Fish) animal).swim().contentEquals("Can Swim")) {
				swimCount++;
		}

	}
		
		LOGGER.info("FlyCount :"+flyCount);
		LOGGER.info("WalkCount :"+walkCount);
		LOGGER.info("SingCount :"+singCount);
		LOGGER.info("SwimCount :"+swimCount);
		
		
}
}
