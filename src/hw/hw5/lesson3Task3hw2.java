package hw.hw5;

public class lesson3Task3hw2 {
    //3. Print name of Weekday according to number. For example: Enter 1, Print “Monday”

    public static void main(String[] args) {

        int number = 0;
        dayWeek(7);
    }
        static void dayWeek(int number){
            switch(number){

            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
        }
    }
}
