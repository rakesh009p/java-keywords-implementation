package com.stackroute;

//this class implements conditional loop statements with some basic examples
public class ConditionalLoops {
    public static void main(String[] args) {
        //declaring variables and initializing
        int i, j = 0, n = 6;
        //while statements
        while (j < 5) {
            System.out.println("hello");
            j++;
        }
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
    }
}

