package com.example.singteltest1;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Animal {

	/**
	 * Default behaviour for all animals
	 * 
	 * @return
	 */
	@JsonProperty
	public String walk() {
		return "walk";
	}
	public abstract String sound();
}
