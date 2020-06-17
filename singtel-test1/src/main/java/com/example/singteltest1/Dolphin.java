package com.example.singteltest1;

public class Dolphin {
	
	private Fish fish = new Fish();
	

	public Fish getFish() {
		return fish;
	}

	public void setFish(Fish fish) {
		this.fish = fish;
		
	}
	
	
	public String swim() {
		return "Dolphin "+fish.swim();
	}
	

}
