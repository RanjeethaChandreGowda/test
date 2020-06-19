package com.example.singteltest1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
	
	@GetMapping("/animals")
	@ResponseBody
	public List<Animal> queryAnimal(@RequestBody Map<String,Boolean>  animalValues) {
		
		
		
		List<Animal> animalsList = new ArrayList<Animal>();
		
		
		Animal[] animals = new Animal[] { new Duck(), new Chicken(), new Rooster(), new Parrot(), new Fish(),
				new Shark(), new ClownFish(), new Dog(), new Cat() };
		for (Animal animal : animals) {
			
		 
		if(null!=animalValues.get("walk") && animalValues.get("walk")) {
			if(animal instanceof Animal && !((animal).walk().contains("Cannot Walk"))) {
				animalsList.add(animal);
				
			}
		}
		if(null!=animalValues.get("fly") && animalValues.get("fly")) {
			if(animal instanceof Bird && (!((Bird) animal).fly().contains("can't fly") )) {
				animalsList.add(animal);
				
			}
		}
		if(null!=animalValues.get("swim") && animalValues.get("swim")) {
			if(animal instanceof Fish && (!((Fish) animal).swim().contains("Can Swim"))) {
				animalsList.add(animal);
			}
		}
			
		
		
		System.out.println("List"+animalsList);
		
		}
		return animalsList;
	}
}
		
	

