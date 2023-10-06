package view;

import java.util.List;
import java.util.regex.*;

public class Validation {

    // ------------------- Check Valid UserName
    public boolean isValidUserName(String userName) {

        if (userName.length() < 5 || userName.contains(" ")) {
            return false;
        }

        return true;
    }

    public boolean isValidPassWord(String passWord) {
        return passWord.length() >= 6 && !passWord.contains(" ");
    }

}
