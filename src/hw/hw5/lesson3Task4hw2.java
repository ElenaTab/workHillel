package hw.hw5;

public class lesson3Task4hw2 {
    //4. Check length of string, if string more then expected print error

    public static void main(String[] args) {

        test("test");
    }

    static void test(String n) {

        if (n.length() > 4) {
            System.out.println("Error");
        }
    }
}
