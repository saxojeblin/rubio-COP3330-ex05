/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        int term1, term2, sum, diff, quot, mult;
        String num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the first number? ");
        num1 = sc.nextLine();

        System.out.print("What is the second number? ");
        num2 = sc.nextLine();

        term1 = Integer.parseInt(num1);
        term2 = Integer.parseInt(num2);

        sum = term1 + term2;
        diff = term1 - term2;
        quot = term1 / term2;
        mult = term1 * term2;

        String newLine = "\n";

        System.out.println(num1 + " " + "+" + " " + num2 + " " + "=" + " " + sum + newLine + num1 + " " + "-" + " " + num2 + " " + "=" + " " + diff + newLine
                          + num1 + " " + "*" + " " + num2 + " " + "=" + " " + mult + newLine +num1 + " " + "/" + " " + num2 + " " + "=" + " " + quot);

    }
}
