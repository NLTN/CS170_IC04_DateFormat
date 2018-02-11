
/*
    Nguyen, Nguyen
    CS A170
    02/09/2018

    IC04_DateFormat
 */
import java.util.Scanner;

public class DateFormat
{

    public static void main(String[] args)
    {
        // Variables
        String userinput;
        Scanner consoleScanner = new Scanner(System.in);

        // Get input from user
        System.out.println("Please enter the date (format MM/DD/YYYY) and include the forward slashes:");
        userinput = consoleScanner.nextLine();

        // Display
        System.out.println("\nIn the European format, DD.MM.YYYY, this date is:");
        System.out.println(userinput.substring(3, 5) + "." + userinput.substring(0, 2) + "." + userinput.substring(6));

        // Close the scanner
        consoleScanner.close();
    }

}
