package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

    public static boolean isSubstring(String fullStr, String partStr) {
        Pattern pattern = Pattern.compile(partStr);
        Matcher matcher = pattern.matcher(fullStr);
        return matcher.find();
    }
}
