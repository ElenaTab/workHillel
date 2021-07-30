package hw.hw5;

import java.util.Scanner;

public class Task11hw1 {
    /* 1. Write a Java program that reads a number in inches, converts it to meters.
        Note: One inch is 0.0254 meter.
        Test Data
        Input a value for inch: 1000
        Expected Output: 1000.0 inch is 25.4 meters */
    public static void main(String[] args) {
        converts(1000);

    }
        public static void converts(int inch){

        System.out.println("Output: " + inch + " inch is " + inch * 0.0254 + " meters" );
    }

}
