package com.example.singteltest1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class TestSolution {

	@Test
	public void testAnimalWalk() {
		Animal animal = new Animal();
		assertEquals("walk", animal.walk());
	}

	// Commenting this test method as the Bird class become the Abstract. We can use
	// Mock framework to instantiate. Not doing it for test.
	/*
	 * @Test public void testBirdFly() { Bird bird = new Bird(); assertEquals("fly",
	 * bird.fly()); }
	 * 
	 * @Test public void testBirdSing() { Bird bird = new Bird();
	 * assertEquals("sing", bird.sing()); }
	 **/
	@Test
	public void testChickenSound() {
		Bird bird = new Chicken();
		assertEquals("Cluck Cluck", bird.sound());
	}

	@Test
	public void testDuckSound() {
		Bird bird = new Duck();
		assertEquals("Quack Quack", bird.sound());
	}

	@Test
	public void testDuckSwim() {
		Duck duck = new Duck();
		assertEquals("Duck can swim", duck.swim());
	}

	@Test
	public void testChickenFly() {
		Bird bird = new Chicken();
		assertEquals("Chicken can't fly because wings are clipped", bird.fly());
	}

	@Test
	public void testRoosterSound() {

		Bird bird = new Rooster();
		assertEquals("Cock-a-doodle-doo", bird.sound());
	}

	@Test
	public void testRoosterGender() {

		Rooster rooster = new Rooster();
		assertEquals("male", rooster.gender());
	}

	@Test
	public void testChickenGender() {

		Chicken chicken = new Chicken();
		assertEquals("female", chicken.gender());
	}

}
