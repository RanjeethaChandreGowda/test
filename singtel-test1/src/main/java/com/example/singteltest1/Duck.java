package com.example.singteltest1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Duck extends Bird {

	@JsonProperty
	public String sound() {
		return "Quack Quack";
	}

	@JsonProperty
	public String swim() {
		return "Duck can swim";
	}

}
