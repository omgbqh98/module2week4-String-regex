import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckClassName {
    static final String CHECK_NAME = "^[CAP][0-9]{4}[GHIKLM]";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CHECK_NAME);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
