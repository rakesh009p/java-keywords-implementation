package com.stackroute;

public class Main {
    public static void main(String[] args) {
        //implementing methods by creating  objects
        Audi audi = new Audi("r8", "audi");
        audi.brakes();
        System.out.println(audi.getName());
        audi.engine();
        Car car = new Car("basic", "car");
        car.engine();
    }
}
