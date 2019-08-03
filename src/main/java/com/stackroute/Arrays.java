package com.stackroute;
//this program is demonstrate arrays

public class Arrays {
    public static void main(String[] args) {

//array declaration
        int[] array;
        // creating array size of 3
        array = new int[3];
        //inserting values into arrays

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
