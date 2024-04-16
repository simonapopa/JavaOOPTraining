package zJavaTests;

import java.util.Arrays;

public class ConditionalStatement {
    /*
 B) Pentru lista de numere data:
    int[] numbers = {10, 8, 9, 11, 13};
 1. Gasiti valorea minima si indexul acesteia
 2. Gasiti acelasi lucru doar ca pentru valoarea maxima
   */
    public void listNumbers() {
        int[] numbers = {10, 8, 9, 11, 13};

        for (int i = 0; i < numbers.length; i++) {
            // Gasiti valorea minima si indexul acesteia
            if (numbers[i] == Arrays.stream(numbers).min().getAsInt()) {
                System.out.println("Valoarea minima este " + Arrays.stream(numbers).min().getAsInt() + " si index " + i);
            }
            // Gasiti acelasi lucru doar ca pentru valoarea maxima
            if (numbers[i] == Arrays.stream(numbers).max().getAsInt()) {
                System.out.println("Valoarea maxima este " + Arrays.stream(numbers).max().getAsInt() + " si index " + i);
            }
        }
    }

    //    1. Write a Java program to get a number from the user and print whether it is positive or negative.
//    Test Data
//    Input number: 35
//    Expected Output : Number is positive
    public void isNumberPositiveOrNegative(int number) {
        if (number >= 0)
            System.out.println("Number " + number + " is positive");
        else {
            System.out.println("Number " + number + " is negative");
        }
    }

    //    Write a Java program that takes three numbers from the user and prints the greatest number.
//    Test Data
//    Input the 1st number: 25
//    Input the 2nd number: 78
//    Input the 3rd number: 87
//    Expected Output : The greatest: 87
    public void greatestNumber(int one, int two, int three) {
        if ((one < two) && (two < three)) {
            System.out.println("Greatest number is " + three);
        }
        if ((one < two) && (two > three)) {
            System.out.println("Greatest number is " + two);
        }
        if ((one > two) && (one < three)) {
            System.out.println("Greatest number is " + three);
        }
        if ((one > two) && (one > three)) {
            System.out.println("Greatest number is " + one);
        }
    }

    //    6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
//    Test Data
//    Input floating-point number: 25.586
//    Input floating-point another number: 25.589
//    Expected Output :     They are different
    public void checkFloatDecimals(double a, double b) {
        if (a != b) {
            System.out.println("Different");
        } else {
            System.out.println("Identical");
        }
    }

    //    8. Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input.
//    If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
//    Test Data
//    Input an alphabet: p
//    Expected Output :     Input letter is Consonant
    public void enterAlphabetCharacter(String x) {
        x = x.toLowerCase();
        if (x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u")) {
            System.out.println("Vowel");
        } else if (x.equals("p") || x.equals("b") || x.equals("m") || x.equals("d") || x.equals("t")) {
            System.out.println("Consonant");
        } else {
            System.out.println("Unsupported");
        }
    }

    public void enterAlphCharacter(String x) {
        x = x.toLowerCase();
        String[] vowel = {"a", "e", "i", "o", "u"};
        String[] cons = {"p", "b", "m", "d", "t"};

        for (int i = 0; i < vowel.length; i++) {
            if (x.equals(vowel[i])) {
                System.out.println("Vowel");
            }
        }
        for (int i = 0; i < cons.length; i++) {
            if (x.equals(cons[i])) {
                System.out.println("Consonant");
            }
        }
    }

    //    17. Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.
//    The pattern is as follows :
//            1
//            22
//            333
//            4444
    public void rightAngleTriangle() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //16. Write a Java program to display the pattern like a right angle triangle with a number.
//    Test Data
//    Input number of rows : 10
//    Expected Output :
//            1
//            12
//            123
//            1234
//            12345
//            123456
//            1234567
//            12345678
//            123456789
//            12345678910
    public void angleTriangleToTen() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println(" ");
        }
    }

    //    18. Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.
//    The pattern like :
//            1
//            2 3
//            4 5 6
//            7 8 9 10
    public void angleTriangleIncremented() {
        int k=1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(k++);
            }
            System.out.println(" ");
        }
    }

//    30. Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, "All numbers are different"
//            if all three numbers are different and "Neither all are equal or different" otherwise.
//    Test Data
//    Input first number: 2564
//    Input second number: 3526
//    Input third number: 2456
//    Expected Output :    All numbers are different
    public void compareNumbers(int first, int second, int third){
        if(first == second && second == third){
            System.out.println("All 3 numbers are equal");
        }else {
            System.out.println("Different");
        }
    }

}
