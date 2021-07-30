package lesson.lesson5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = in.nextInt();
        System.out.println(isEven(number));
    }

    public static boolean isEven(int n) {

        return (n % 2 == 0);
    }
}


