package com.example.singteltest1;

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