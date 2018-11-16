import java.util.Scanner;

public class ThirdSessionMain {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        // int first = scanner.nextInt();
        // int second = scanner.nextInt();

        System.out.print("Give text: ");
        String input = scanner.next();
        System.out.print("Give a number: ");
        double number = scanner.nextDouble();

        System.out.print("Give first nr to compare: ");
        double first = scanner.nextDouble();
        System.out.print("Give second nr to compare: ");
        double second = scanner.nextDouble();
        System.out.print("Give third nr to compare: ");
        double third = scanner.nextDouble();

        // System.out.println("The bigger number is " + getMax(first, second));
        //System.out.println(matchText(input));
        // System.out.println(equalOrHigherThanTwo(number));
        // System.out.println(getInput(input, number));
        // System.out.println(checkInput(number) + number);
        //System.out.println(getIntComp(number));
        //System.out.println(getPressedNr(number));
        // System.out.println(checkIfEvenNr(number));
        //System.out.println(checkIfCanVote(number));
        System.out.println(printGreatestNumber(first, second, third));
    }

    // Given two numbers, see which one is the greatest and print it
    public static int getMax(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //Given a text input, if it is “Evozon”, then print “Learning text comparison”. If not, print “Got to try some more”
    public static String matchText(String input) {
        if (input.equals("Evozon")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }

    }

    // Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number
    public static int equalOrHigherThanTwo(int nr) {
        if (nr >= 2 && nr <= 8) {
            return nr;
        } else
            return 0;
    }

    //Given a text input and a number input, if the text is equal to “Evozon” AND the number
    //is equal to or lower than 3, print the text and the number. If the text is not “Evozon” AND
    //the number is equal to or higher than 4, print the number and the text, in this order.

    public static void getInput(String input, int nr) {
        if (input.equals("Evozon") && nr <= 3) {
            System.out.println(input + nr);
        }
        if (!input.equals("Evozon") && nr >= 4) {
            System.out.println(nr + input);
        }
    }

    // Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow
    //this winter was(cm):” and the given number. Else print “The forecast snow is(cm):”

    public static void checkInput(int nr) {
        if (nr > 8 || nr == 6) {
            System.out.println("The amount of snow this winter was(cm): ");
        } else {
            System.out.println("The amount of snow this winter was(cm): ");

        }
    }

    // Given a number input, if the number is greater than 3 but not equal to 4, print “The
    //number is greater than 3 and not equal to 4”. Else if the number is equal to 4 print ”The
    //number is equal to 4”. Else if the number is lower than 3 print “The number is lower than 3”

    public static String getIntComp(int nr) {
        if (nr > 3 && nr != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (nr == 4) {
            return "The number is equal to 4";
        } else if (nr < 3) {
            return "The number is lower than 3";
        }

        return null;
    }

    // If the user pressed number keys( from 0 to 9), the program will tell the number that is
    //pressed, otherwise, program will show "Not allowed”. (use a switch case for this)
    public static void getPressedNr(int nr) {
        switch (nr) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(nr);
                break;
            default:
                System.out.println("Not allowed!");

        }
    }

    //Write a Java program to determine whether an input number is an even number
    public static void checkIfEvenNr(int nr) {
        if (nr % 2 == 0) {
            System.out.println("Even number!");
        } else
            System.out.println("Not even number!");
    }

    // Write Java program to allow the user to input his/her age. Then the program will show if the
    //person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.
    public static String checkIfCanVote(double age) {
        if (age >= 18) {
            return "Eligible to vote!";
        } else {
            return "Minor...";
        }
    }

    // Take three numbers from the user and print the greatest number.
    public static double printGreatestNumber(double a, double b, double c) {
        if (a > b && a < c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }

    }
}
