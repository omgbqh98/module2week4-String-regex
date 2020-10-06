import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkAccount {

    static final String CHECK = "^[a-z0-9_]{6,}$";

    public checkAccount() {
    }

    boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CHECK);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
