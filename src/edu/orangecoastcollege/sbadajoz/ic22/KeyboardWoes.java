package edu.orangecoastcollege.sbadajoz.ic22;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
Badajoz, Seve
CS A170
November 18, 2016

IC22
*/

public class KeyboardWoes {
    public static void main(String[] args) {
        int number = 0;
        Scanner input = new Scanner(System.in);
        boolean notValid = false;
        do {
            try {
                System.out.print("Please enter a number: ");
                number = input.nextInt();
                if(number > 0 && number < 100) {
                    System.out.println("The number you entered is " + number);
                    notValid = false;
                }
                else {
                    System.out.println("Error: please enter a number between 0 and 100");
                    notValid = true;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Please enter only integral numbers.");
                notValid = true;
                input.next();               
            }
        }while(notValid);
        input.close();
    }
}
