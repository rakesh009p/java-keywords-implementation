package com.stackroute;

//this program implements concepts of oops
public class Car {

    private String name;
    private String brand;
    private String brakes;
    private String engine;
    //generating getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    //passing arguments into constructor

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
    //writing  methods

    public void brakes() {
        System.out.println("brakes applied");
    }

    public void engine() {
        System.out.println("engine started");
    }


}