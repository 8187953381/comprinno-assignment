package assignment;
//      Question-1
//      Imports required

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class FibonacciSeries {
    public static void main(String[] args) throws IOException {
//        Get user input using Scanner class
        Scanner sc = new Scanner(System.in);
//        Read number of tests to be run
        int testCases = sc.nextInt();
//        Iterate over the no. of test cases
        for (int iterator = 1; iterator <= testCases; iterator++) {
//        Take user input
            String userInput = sc.next();
//        Declare an array of size 26
            int[] alphabet = new int[26];
//        Initialize array values with 0
            Arrays.fill(alphabet, 0);
//        Loop over the array and append occurance count of each alphabet
            for (int i = 0; i < (int) userInput.length(); i++) {
                alphabet[(int) userInput.charAt(i) - 'a']++;
            }
//        Initialize a vector
            Vector<Integer> distinct = new Vector<>();
            for (int x : alphabet) {
//        Add into vector if occurance of any alphabet is greater than 0
                if (x > 0) {
                    distinct.add(x);
                }
            }
//        sort the vector using Collections inbult method sort
            Collections.sort(distinct);
//            Take the boolean value for checking specified condition
            boolean checker1 = true;
            boolean checker2 = true;
//        check if vector size>2 else it will automatically print dynamic
            if (distinct.size() > 2) {
                for (int i = 2; i < distinct.size(); i++) {
                    if (distinct.get(i) != distinct.get(i - 1) + distinct.get(i - 2)) {
                        checker1 = false;
                        break;
                    }
                }
//        use temp variable to switch the values
                int temp = distinct.get(0);
                distinct.set(0, distinct.get(1));
                distinct.set(1, temp);
                for (int i = 2; i < distinct.size(); i++) {
                    if (distinct.get(i) != distinct.get(i - 1) + distinct.get(i - 2)) {
                        checker2 = false;
                        break;
                    }
                }
            }
//        Check the final condition and print the value accordingly on console
            System.out.println(checker1 || checker2 ? "Dynamic" : "Not");
        }
    }
}


