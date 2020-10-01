# CI646 Regex lab

Firstly, familiarise yourself with the documentation for the Java regex package
`java.util.regex`: https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html.

As you complete the problems below, you can test your regexes at http://regex101.com.

1. Modify the class `PhoneNumbers.java` so that it validates UK landline
phone numbers. Valid numbers take one of the following forms:

    * A 6 digit local number, e.g. 123456. Local numbers may not begin
with a zero.
    * An area code, which may be surrounded by brackets, followed by an
optional space, followed by a valid local number. Area codes consist
of 5 digits and begin with the digits 01. E.g.,
        - 01273 123456
        - (01273)123456
    * The international dialling code, +44, followed by a valid area code
from which the leading digit has been stripped, followed by a valid
local number. Numbers using the international dialling code may not
contain spaces. E.g. +441273123456.

2. Modify your program to validate dates in one of the following forms:

    * `dd-Mon-yyyy`, where `dd` is a valid day of the month (01 to 31), `yyyy`
is any four digits and Mon is a string from the set `{ Jan, Feb, Mar,
Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec}`.
    * `dd/mm/yyyy`, where `dd` is a valid day of the month, `mm` is a valid month
(01 to 12) and `yyyy` is any four digits.
    * `mm/dd/yyyy`, where `mm` is a valid month, `dd` is a valid day of the month
and `yyyy` is any four digits.
    
    Each of these patterns have things in common (e.g. valid days of the month) -- 
    make separate variables for the parts of the patterns so you don't 
    repeat yourself. Surrounding each sub-pattern in grouping brackets
    will ensure that they still work when you combine them. 
    
    If the input string is a date in the form `dd-Mon-yyyy`, your program should print
“Valid date”. 

    If the input string is a date in the form `dd/mm/yyyy` but not
`mm/dd/yyyy`, your program should print “Valid UK date”. If the input string is
a date in the form `mm/dd/yyyy` but not `dd/mm/yyyy`, your program should print "Valid US date". 
If the input string matches both `dd/mm/yyyy` and `mm/dd/yyyy` (e.g. 01/01/2020) your
program should print “Valid date in the form xx/xx/xxxx”. For all other
input, your program should print “Invalid date”.

If you want to become a regex wizard the book *Mastering Regular Expressions* 
by Jeffrey Friedl is very good: http://regex.info/book.html.
