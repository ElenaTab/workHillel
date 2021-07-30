package hw.hw5;

import java.util.Scanner;

public class Task22hw1 {
        /*2. Write a Java program to convert minutes into a number of years and days.
         Test Data
         Input the number of minutes: 3456789
         Expected Output: 3456789 minutes is approximately 6 years and 210 days*/

    public static void main(String[] args) {
        convert(3456789);

    }
        public static void convert(int minutes){
        System.out.println("Output: " + minutes + " minutes is approximately " +( minutes / 525600)
                + " years and " + ( (minutes % 525600)/1440)  + " days " );

    }

}
