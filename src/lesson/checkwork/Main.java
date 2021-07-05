package lesson.checkwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String username;
        String password;
        int number;
        int number2;
        String rev1;

        System.out.println("Enter your username and password: ");

        System.out.println("Username: ");
        username = input.nextLine();

        System.out.println("Password: ");
        password = input.nextLine();

        User login = new User();

        if(login.checkPassword(username, password))
            System.out.println("You are welcome!");
        else
            System.out.println("Login or password is not correct!");


        System.out.println("Enter number: ");

        System.out.println("Number: ");
        number = input.nextInt();

        EvenNumber number1 = new EvenNumber();
        number1.even(number);


        System.out.println("Enter number2: ");

        System.out.println("Number2: ");
        number2 = input.nextInt();

        Armstrong numberArm = new Armstrong();
        numberArm.arm();

        System.out.println("Enter string: ");
        System.out.println("String: ");
        rev1 = input.nextLine();



    }

}

