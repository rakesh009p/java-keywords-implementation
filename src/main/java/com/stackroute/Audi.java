package com.stackroute;


public class Audi extends Car {
    public Audi(String name, String brand) {

        super(name, brand);
    }
    //overriding the methods of super class
    //writing logic for this particular class

    @Override
    public void brakes() {
        System.out.println("audi brakes applied");
    }

    @Override
    public void engine() {
        System.out.println(" audi engine started");
    }
}
