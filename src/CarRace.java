/*
 * Created on 2024-09-25
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import java.util.Random;

public class CarRace {

	private String name;
	private Driver driver1;
	private Driver driver2;

	private static int numberOfDrivers = 0;

	public CarRace(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Car car1 = new Car("Mini Beast");
		Car car2 = new Car();
		Driver yoshi = new Driver("Yoshi", car1);
		Driver mario = new Driver("Mario", car2);
		CarRace rainbowRoad = new CarRace("Rainbow Road");

		yoshi.participateInRace(rainbowRoad);
		mario.participateInRace(rainbowRoad);
		if (numberOfDrivers == 2) {
			rainbowRoad.startRace();

			rainbowRoad.determineWinner();
		} else {
			System.out.println("Not enough drivers.");
		}
	}

	// Non-static methods that can be accessed using a CarRace object
	// Behavior
	public void startRace() {
		System.out.println("Race on " + this.name + " is starting...\n\nReady, set, GO!\n");
		
		Random random = new Random();
		boolean headsOrTails = random.nextBoolean();

		if (headsOrTails) {
			this.driver1.go();
			this.driver2.go();
		} else {
			this.driver2.go();
			this.driver1.go();
		}
	}

	public void signUp(Driver driver) {
		if (this.driver1 == null) {
			this.driver1 = driver;
			numberOfDrivers++;
		} else if (this.driver2 == null) {
			this.driver2 = driver;
			numberOfDrivers++;
		} else {
			System.out.println("Two drivers already signed up, please wait until the next race!");
		}
	}

	// Example: We determine the winner based on their achieved speed
	private void determineWinner() {
		System.out.println("\nThe race is over; comparing speeds ...\n"); 
		if (this.driver1.getCar().getSpeed() > this.driver2.getCar().getSpeed()) {
			System.out.println(this.driver1.getName() + " has won!");
		} else if (this.driver2.getCar().getSpeed() > this.driver1.getCar().getSpeed()) {
			System.out.println(this.driver2.getName() + " has won!");
		} else {
			System.out.println("It's a draw!");
		}
	}
}
