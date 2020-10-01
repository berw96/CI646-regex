package ci646.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Dates {

    // NB: backslashes are already "special" in java strings, so they need to be escaped twice in
    // regexes. Thus, the regex '\d' becomes '\\d' in Java. See
    // http://docs.oracle.com/javase/tutorial/essential/regex/ for details.
    private static final String dateRegex = "REGEX"; //modify this string to add your regex.
                                                 //You can of course make more string variables to hold regexes
    private static final String prompt = "Enter a date or press return to end: ";

    public static void main(String[] args) {
        System.out.print(prompt);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String date;
        try {
            date = bufferedReader.readLine().trim();
            while(!date.equals("")) {
                if(date.matches(dateRegex)) {
                    System.out.printf("%s is a valid date.\n", date);
                } else { // add more cases here
                    System.out.printf("%s is not a valid date.\n", date);
                }
                System.out.print(prompt);
                date = bufferedReader.readLine().trim();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
