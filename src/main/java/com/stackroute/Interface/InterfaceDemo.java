package com.stackroute.Interface;

public interface InterfaceDemo  {
    public int getNumber();
    default void getId(){
        System.out.println("my id doesnot exists");
    }

}
