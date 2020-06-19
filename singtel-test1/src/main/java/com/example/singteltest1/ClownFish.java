package com.example.singteltest1;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClownFish extends Fish {
	@JsonProperty
	public String size() {
		return "ClownFish are small";
	}
	@JsonProperty
	public String color() {
		return "ClownFish are orange in color";
	}
	@JsonProperty
	public String behaviour() {
		return "ClownFish makes jokes";
	}

}
