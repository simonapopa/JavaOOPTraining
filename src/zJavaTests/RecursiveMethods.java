package zJavaTests;

public class RecursiveMethods {
    //    2. Write a Java recursive method to calculate the sum of all numbers from 1 to n.
    public int calculateSum(int n) {
        int sum = 0;
        if (n == 0) {
            return 0;
        }
        sum = n + calculateSum(n - 1);
        return sum;
    }
//    6. Write a Java recursive method to reverse a given string.
    public String reverseString(String string){
        if(string.isEmpty() || string.length() == 1){
            return string;
        }
        return reverseString(string.substring(1)) +string.charAt(0);
    }


}