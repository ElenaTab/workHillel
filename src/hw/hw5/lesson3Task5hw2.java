package hw.hw5;

public class lesson3Task5hw2 {
    /*5. Create program that login you in system. Check password length. Example:
Enter your name: Yuriy (in case wrong login print error)
Enter your password: pass (in case wrong pass print error)*/
    public static void main(String[] args) {
        setName("Yuriy");
        setPassword("pass");
    }

        public static void setName(String name) {
            String myname = "Yuriy";

            if (name.equals(myname)) {
                System.out.println("yes");
            } else {
                System.out.println("error name");
            }
        }

            public static void setPassword(String password) {
                String pass ="ddd";
            if ((password.length() == 4) || (password.equals(pass))) {

                System.out.println("ok");
            } else {
                System.out.println("error password");
            }

        }
    }


