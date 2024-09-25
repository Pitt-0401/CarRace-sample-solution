/*
 * Created on 2024-09-25
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import java.util.Random;

public class Car {
	private String model;
	private int speed = 0;

	// Constructors
	// Partially parameterized constructor
	public Car(String type) {
		this.model = type;
	}

	// Default constructor: the default car is a Blooper
	public Car() {
		this.model = "Blooper";
	}

	// Getters & Setters
	public String getModel() {
		return this.model;
	}

	public int getSpeed() {
		return this.speed;
	}
	
	// Behavior
    public void drive() {
		// 10 is the default speed
        speed = 10; 
		System.out.println(model + " started to drive.");
    }
	
	public void accelerate() {
		Random random = new Random();
		int randomNumber = random.nextInt(10)+1;
		while (speed <= 20) {
        	speed += randomNumber;
		}
		System.out.println(model + " is now driving " + speed + "!");
    }
}
