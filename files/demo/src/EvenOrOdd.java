import java.util.*;

/**
 * Program to determine if a number is even or odd
 * @author Chris Brown, Jessica Schmidt Young
 */
public class EvenOrOdd {

    /**
     * Starts the program
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number (-1 to quit): ");
        int number = console.nextInt();
        while (number != -1) {
            System.out.println("Your number is " + evenOdd(number));
            System.out.print("Enter another number (-1 to quit): ");
            number = console.nextInt();
        }
        System.out.println("Done");
    }

    /**
     * Determines if a number is even or odd
     * @param num number input by user
     * @return String if value is even or odd
     */
    public static String evenOdd(int num) {
        if (num == 0 || num == 2 || num == 4 || num == 6 || num == 8) {
            return "Even";
        }
        return "Odd";
    }
}


