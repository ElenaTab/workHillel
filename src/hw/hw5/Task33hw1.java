package hw.hw5;

import java.util.Scanner;

public class Task33hw1 {
    /*3. Write a Java program to compute body mass index (BMI).
         Test Data
         Input weight in pounds: 452
         Input height in inches: 72
         Expected Output:
         Body Mass Index is 61.30159143458721*/

    public static void main(String[] args) {
        massIndex(452, 72);
    }
    public static void massIndex(int pounds, int inches){

        System.out.println("Body Mass Index is: " + (703 * pounds / (Math.pow (inches, 2) )));
    }

}

