/*
 * Created on 2024-09-25
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

public class Driver {
    private String name;
    private Car car;

    // Constructor
    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    // Getter
    public String getName() {
        return this.name;
    }

    public Car getCar() {
        return this.car;
    }

    // Behavior

    // We identified a new method to allow a driver to participate in a specific
    // race
    // To signup, we pass a reference of the driver object to the CarRace
    public void participateInRace(CarRace race) {
        race.signUp(this);
    }

    public void go() {
        System.out.println(name + " is starting with " + car.getModel() + ".");
        this.car.drive();
        this.car.accelerate();
    }
}
