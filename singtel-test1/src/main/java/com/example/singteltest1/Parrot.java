package com.example.singteltest1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Parrot extends Bird {

	private Animal animal;
	
	public Parrot(Animal animal) {
		this.animal = animal;

	}

	public Parrot() {
	}
	
	public String sound() {
		return animal.sound();
	}

}