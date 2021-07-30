package lesson.lesson4;

import java.util.Scanner;

public class Task2 {
    /*You have to design the code such that the user has only three tries to guess the correct pin of the account.
    You set the pin as a constant with a final attribute. When correct display “Correct, welcome back.
    ” When incorrect display “Incorrect, try again.”. When ran out of tries display
    “Sorry but you have been locked out.” */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter pin:");

        String expected = "Test";
        for (int i = 0; i < 3; i++) {

            String actual = in.nextLine();

            if (actual.equals(expected))
            {
                System.out.println("Correct, welcome back:");
                break;
            }

            else {
                System.out.println("Incorrect, try again");
            }
        }
        System.out.println("Sorry");
    }
}
