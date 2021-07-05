package lesson.checkwork;

public class User {

    public String usernameDef = "Lena";
    public String passwordDef = "test";

    public boolean checkPassword(String username, String password){

        if((usernameDef.equals(username)) && (passwordDef.equals(password)))
            return true;
        else
            return false;
    }

}
