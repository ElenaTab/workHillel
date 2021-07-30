package hw.hw5;

import java.util.Scanner;

public class Task55hw1 {
    // 5. Write a Java program to generate random integers in a specific range.(Hint: Use Math class)

    public static void main(String[] args){
        sc();
    }
    public static void sc(){
        int a = 1;
        int b = 100;
        int random_number1 = a + (int) (Math.random() * b);
        System.out.println("Input the random number: " + random_number1);
    }
}

