package hw.hw5;

public class Task2hw3 {
    /*You have to design the code such that the user has only three tries to guess the correct pin of the account.
    You set the pin as a constant with a final attribute. When correct display “Correct, welcome back.
    ” When incorrect display “Incorrect, try again.”. When ran out of tries display
    “Sorry but you have been locked out.” */
    public static void main(String[] args) {

        enterPin("Test");
    }

        public static void enterPin(String actual){
        String expected = "Test";
        for (int i = 0; i < 3; i++) {

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

