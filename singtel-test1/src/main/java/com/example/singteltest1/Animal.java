package com.example.singteltest1;

public abstract class Animal {

	/**
	 * Default behaviour for all animals
	 * 
	 * @return
	 */
	public String walk() {
		return "walk";
	}
	public abstract String sound();
}
