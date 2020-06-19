package com.example.singteltest1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cat extends Animal {
	@JsonProperty
	public String sound() {

		return "Meow";

	}

}
