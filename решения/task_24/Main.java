package task_24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean validate(String str)
    {
        String ipv4regex = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$";

        return Pattern.matches(ipv4regex, str);
    }

    public static void main(String[] args) {

        boolean res;

        res = validate("255.255.100.110");
        System.out.println(res);
        res = validate("256.10.30.50");
        System.out.println(res);
        res = validate("20.0.279.50");
        System.out.println(res);
        res = validate("20.48.70.64");
        System.out.println(res);
        res = validate("0.0.0.0");
        System.out.println(res);
    }
}
