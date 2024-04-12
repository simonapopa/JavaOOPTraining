package zJavaTests;

import java.util.Arrays;

public class Methods {
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
//    Expected Output :
//    Number is positive
    public void isNumberPositiveOrNegative(int number){
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
//    Expected Output :
//    The greatest: 87
    public void greatestNumber(int one, int two, int three){
        if((one < two) && (two < three)){
            System.out.println("Greatest number is " + three);
        }
        if ((one < two) && (two > three) ){
            System.out.println("Greatest number is " + two);
        }
        if ((one > two) && (one < three)){
            System.out.println("Greatest number is " + three);
        }
        if ((one > two) && (one > three)){
            System.out.println("Greatest number is " + one);
        }
    }
}
