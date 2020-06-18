package com.example.singteltest1;

public class Rooster extends Bird {

	private Chicken chicken = new Chicken();
	
	
	

	public Chicken getChicken() {
		return chicken;
	}

	public void setChicken(Chicken chicken) {
		this.chicken = chicken;
	}

	public String fly() {
		return chicken.fly();
	}

	@Override
	public String sound() {
		
		return "rooster.sound";
	}

	public String gender() {

		return "male";

	}

}
