package sdt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckSoDT {
    static final String CHECK_NUMBER = "^(84-)[0-9]{10}$";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CHECK_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
