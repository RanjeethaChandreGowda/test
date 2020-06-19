package com.example.singteltest1;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Bird extends Animal {

	 
	@JsonProperty
	public String fly() {
		return "fly";
	}
	@JsonProperty
	public String sing() {
		return "sing";
	}

	

}
