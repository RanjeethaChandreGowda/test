package com.example.singteltest1;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class TestSolution {

	@Test
	public void testAnimalWalk() {
		Animal animal = new Animal();
		assertEquals("walk", animal.walk());
	}

	@Test
	public void testBirdFly() {
		Bird bird = new Bird();
		assertEquals("fly", bird.fly());
	}

	@Test
	public void testBirdSing() {
		Bird bird = new Bird();
		assertEquals("sing", bird.sing());
	}

}
