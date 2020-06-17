package com.example.singteltest1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;






@SpringBootTest
public class TestSolution {
	
	// Commenting this test method as the Animal class become the Abstract
	/*@Test
	public void testAnimalWalk() {
		Animal animal = new Animal();
		assertEquals("walk", animal.walk());
	}*/

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
	
	@Test
	public void testParrotSoundLivesWithDog() {
		Animal animal = new Dog();
		Parrot parrot = new Parrot(animal);
		assertEquals("Woof, woof",parrot.sound());
		
		
	}
	
	@Test
	public void testParrotSoundLivesWithCat() {
		Animal animal = new Cat();
		Parrot parrot = new Parrot(animal);
		assertEquals("Meow",parrot.sound());
		
		
	}
	
	@Test
	public void testParrotSoundLivesWithRooster() {
		Animal animal = new Rooster();
		Parrot parrot = new Parrot(animal);
		assertEquals("Cock-a-doodle-doo",parrot.sound());
		
		
	}
	
	@Test
	public void testParrotSoundWithDuck() {
		Animal animal = new Duck();
		Parrot parrot = new Parrot(animal);
		assertEquals("Quack Quack",parrot.sound());
		
		
	}
	
	@Test
	public  void testFishWalk() {
			
			Fish fish = new Fish();
			assertEquals("Fish Cannot Walk",fish.walk());
		}
		
		
		@Test
		public  void testFishSound() {
				
				Fish fish = new Fish();
				assertEquals("Fish Cannot sing",fish.sound());
			}
		
		@Test
		public  void testFishSwim() {
				
				Fish fish = new Fish();
				assertEquals("Fish Can Swim",fish.swim());
			}


}
