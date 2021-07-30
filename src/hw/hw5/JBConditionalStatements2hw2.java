package hw.hw5;

public class JBConditionalStatements2hw2 {
    /*Write a Java program to find the number of days in a month.
    Test Data
    Input a month number: 2
    Input a year: 2016
    Expected Output :
    February 2016 has 29 days*/
              /*Write a Java program to find the number of days in a month.
            Test Data
            Input a month number: 2
            Input a year: 2016
            Expected Output :
            February 2016 has 29 days*/
    public static void main(String[] strings) {


        int month;
        int year;
        getDey(2, 2016);
    }
        static void getDey(int month, int year){
            int number=0;
            String Month = "Put";

        switch (month) {
            case 1:
                Month = "January";
                number = 31;
                break;
            case 2:
                Month = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number = 29;
                } else {
                    number = 28;
                }
                break;
            case 3:
                Month = "March";
                number = 31;
                break;
            case 4:
                Month = "April";
                number = 30;
                break;
            case 5:
                Month = "May";
                number = 31;
                break;
            case 6:
                Month = "June";
                number = 30;
                break;
            case 7:
                Month = "July";
                number = 31;
                break;
            case 8:
                Month = "August";
                number = 31;
                break;
            case 9:
                Month = "September";
                number = 30;
                break;
            case 10:
                Month = "October";
                number = 31;
                break;
            case 11:
                Month = "November";
                number = 30;
                break;
            case 12:
                Month = "December";
                number = 31;
        }
        System.out.print(Month + " " + year + " has " + number + " days");
    }
}