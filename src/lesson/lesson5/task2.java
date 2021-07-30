package lesson.lesson5;

public class task2 {
    public static void main(String[] args) {

        System.out.println("Sum is " + sumArrey());
    }

    public static int sumArrey() {
        int sum = 0;
        int[] a = {12, 3, 4, 15};
        for (int i = 0; i < a.length; i++)
            sum += a[i];

        return sum;

    }
}

