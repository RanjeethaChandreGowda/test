package com.example.singteltest1;

public class Parrot extends Bird {

	Animal animal;

	Parrot(Animal animal) {
		this.animal = animal;

	}

	public String sound() {
		return animal.sound();
	}

}