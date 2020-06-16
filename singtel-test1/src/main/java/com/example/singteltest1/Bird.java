package com.example.singteltest1;

public abstract class Bird extends Animal {

	abstract String sound();

	public String fly() {
		return "fly";
	}

	public String sing() {
		return "sing";
	}

}
