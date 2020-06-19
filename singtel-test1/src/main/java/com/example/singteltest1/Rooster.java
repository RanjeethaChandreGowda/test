package com.example.singteltest1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rooster extends Bird {

	private Chicken chicken = new Chicken();
	
	
	
	@JsonProperty
	public Chicken getChicken() {
		return chicken;
	}

	@JsonProperty
	public void setChicken(Chicken chicken) {
		this.chicken = chicken;
	}
	@JsonProperty
	public String fly() {
		return chicken.fly();
	}

	@JsonProperty
	@Override
	public String sound() {
		
		return "rooster.sound";
	}
	@JsonProperty
	public String gender() {

		return "male";

	}

}
