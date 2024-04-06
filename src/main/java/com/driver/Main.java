package com.driver;

public class Main {
   public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start(); // Output: Vehicle is starting...
        
        Car car = new Car();
        car.start(); // Output: Car is starting...

        // Polymorphism example
        Vehicle anotherCar = new Car();
        anotherCar.start(); // Output: Car is starting...
}
