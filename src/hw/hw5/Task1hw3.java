package hw.hw5;

public class Task1hw3 {
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
        box(2, 5);
    }

        public static void box(int hv, int wv) {

            for (int i = 0; i < hv; i++) {

                for (int y = 0; y < wv; y++) {
                    System.out.print("#");
                }

                System.out.println();
            }

        }
    }

