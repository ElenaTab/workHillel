package hw.hw5;

public class lesson3hw2 {
    //1. Is it day or evening? In case time more then 18, show Good evening, otherwise Good day. Try to use IF and Ternary.

    public static void main(String[] args) {

        int h=0;
        Hello(19);
    }

        static void Hello(int h){
            int hour=0;
        if (hour >= 18) {
            System.out.println("Good evening!");
        }
        if (hour < 18) {
            System.out.println("Good day!");
        }
    }
}
