package hw.hw5;

public class lesson3Task2hw2 {
    //2. Is it morning, day or evening? In case time more then 18, show Good evening, before 10 Good morning, otherwise Good day.

    public static void main(String[] args) {

        int h=0;
        Hello(13);
    }
        static void Hello(int h){
            int hour=0;
        if (hour <= 10) {
            System.out.println("Good morning!");
        } else if (hour <= 18) {
            System.out.println("Good day!");
        }else {
            System.out.println("Good evening!");
        }


    }
}
