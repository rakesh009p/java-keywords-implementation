package com.stackroute;

import java.util.Scanner;

//this class implements conditional loop statements with some basic examples
public class ConditionalLoops {
    public static void main(String[] args) {
        //declaring variables and initializing
        int i, j = 0, n, input = 0;
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        n = scanner.nextInt();
        input = scanner.nextInt();
        //while statements

        while (j < 5) {
            System.out.println("hello");
            j++;
        }
        //do while loop
        do {
            System.out.println("hi");
        }
        while (j < 5);
        //for loop and if statements
        //for loop starts here
        for (i = 0; i <= n; i++) {
            //if loop starts here
            if (i % 2 == 0) {
                System.out.println("even");
                //prints the statement if condition satisfies
            }
            //if statement ends here
            else {
                System.out.println("odd");
            }
            //else statement ends here

        }
        //for loop ends here
        //switch case starts here
        //checks for value in all case

        switch (input) {

            case 1:

                System.out.println("one");
                break;
            case 2:

                System.out.println("two");
                break;
            default:

                System.out.println("no value");
                break;

        }

    }

}

