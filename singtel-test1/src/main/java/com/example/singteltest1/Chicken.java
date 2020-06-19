package com.example.singteltest1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chicken extends Bird {


	@JsonProperty
	public String sound() {
		return "Cluck Cluck";
	}

	@JsonProperty
	public String fly() {
		return "Chicken can't fly because wings are clipped";
	}
	
	@JsonProperty
	public String gender() {
		return "female";
		}

}
