package com.example.singteltest1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shark extends Fish {
	
	
	@JsonProperty
	public String size() {
		
		return "Sharks are large";
	}
	@JsonProperty
	public String color() {
		
		return "Sharks are grey in color";
	}
	@JsonProperty
	public String eat() {
		
		return "Sharks eat other Fish";
	}

}
