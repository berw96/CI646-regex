package ci646.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Dates {

    // NB: backslashes are already "special" in java strings, so they need to be escaped twice in
    // regexes. Thus, the regex '\d' becomes '\\d' in Java. See
    // http://docs.oracle.com/javase/tutorial/essential/regex/ for details.
    private static final String dd = "([0123]\\d)";
    private static final String mm = "((0[1-9])|(1[012]))";
    private static final String mon = "((Jan)|(Feb)|(Mar)|(Apr)|(May)|(Jun)|(Jul)|(Aug)|(Sep)|(Oct)|(Nov)|(Dec))";
    private static final String yyyy = "(\\d{4})";
    private static final String dateRegex = dd + "-" + mon + "-" + yyyy; //modify this string to add your regex.
                                                 //You can of course make more string variables to hold regexes
    private static final String ukDateRegex = dd + "/" + mm + "/" + yyyy;
    private static final String usDateRegex = mm + "/" + dd + "/" + yyyy;
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
                } else if(date.matches(ukDateRegex) && !date.matches(usDateRegex)) {
                    System.out.printf("%s is a valid UK date.\n", date);
                } else if(date.matches(usDateRegex) && !date.matches(ukDateRegex)) {
                    System.out.printf("%s is a valid US date.\n", date);
                } else if(date.matches(usDateRegex) && date.matches(ukDateRegex)) {
                    System.out.printf("%s is a valid date in the format xx/xx/xxxx.\n", date);
                } else {
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
