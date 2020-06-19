package com.example.singteltest1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dog extends Animal{
	
	@JsonProperty
	public String sound() {
		
		return "Woof, woof";
	}

}
