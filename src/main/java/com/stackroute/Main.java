package com.stackroute;

import com.stackroute.Interface.InterfaceClass;
import com.stackroute.Interface.InterfaceDemo;

public class Main {
    public static void main(String[] args) {
        //implementing methods by creating  objects
        Audi audi = new Audi("r8", "audi");
        audi.brakes();
        System.out.println(audi.boxing());
        System.out.println(audi.getName());
        audi.engine();
        Car car = new Car("basic", "car");
        car.engine();
        NestedClass.InnerNestedClass nested=new NestedClass.InnerNestedClass();
        nested.Display();
        InterfaceClass interfaceClass= new InterfaceClass();
        interfaceClass.getId();

    }
}
