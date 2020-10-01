package ci646.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Dates {

    // NB: backslashes are already "special" in java strings, so they need to be escaped twice in
    // regexes. Thus, the regex '\d' becomes '\\d' in Java. See
    // http://docs.oracle.com/javase/tutorial/essential/regex/ for details.

    private static final String dateRegex = ""; //modify this string to add your regex.
                                                 //You can of course make more string variables to hold regexes
    private static final String ukDateRegex = "";
    private static final String usDateRegex = "";
    private static final String prompt = "Enter a date or press return to end: ";

    public static void main(String[] args) {
        System.out.print(prompt);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String date;
        try {
            date = bufferedReader.readLine().trim();
            while(!date.equals("")) {
                // if statment testing the patterns here...
                System.out.print(prompt);
                date = bufferedReader.readLine().trim();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
