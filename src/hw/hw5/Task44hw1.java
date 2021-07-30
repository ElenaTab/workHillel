package hw.hw5;

public class Task44hw1 {
    /*4. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour
            Test Data
            Input distance in meters: 2500
            Input hour: 5
            Input minutes: 56
            Input seconds: 23
            Expected Output :
            Your speed in meters/second is 0.11691531
            Your speed in km/h is 0.42089513*/

    public static void main(String[] args) {

        massIndex(2500, 5, 56, 23);
    }

        public static void massIndex(int distance, int hours, int minutes, int seconds){
            double timeSeconds;
            double ms, kh;
        timeSeconds = (hours*3600) + (minutes*60) + seconds;
        ms = distance / timeSeconds;
        kh = ( distance/1000.0f ) / ( timeSeconds/3600.0f );

        System.out.println("Your speed in meters/second is "+ms);
        System.out.println("Your speed in km/h is "+kh);


    }

}

