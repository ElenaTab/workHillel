package lesson.lesson4;
import java.util.Scanner;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Write a program that will print a box of *'s taking from user the height and width values.
	example:      Enter height:
			2
			Enter width:
			5
			Output:
			#####
			#####
*/

            Scanner console = new Scanner(System.in);

            System.out.println("Enter height values: ");
            int hv = console.nextInt();


            System.out.println("Enter width values: ");
            int wv = console.nextInt();

            for (int i = 0; i < hv; i++) {

                for (int y = 0; y < wv; y++)
                {
                    System.out.print("#");
                }

                System.out.println();
            }

        }
    }