package assignment;
//      Question-8
//      Imports required

import java.util.*;
import java.lang.*;

public class TwoNumbers {
    public static void main(String[] args) throws Exception {
//      Get user input using Scanner class
        Scanner sc = new Scanner(System.in);
//      Read number of tests to be run
        int testCases = sc.nextInt();
//      Iterate over the no. of test cases using while loop
        while (testCases-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            if (n % 2 == 0) {
                long max = Math.max(a, b);
                long min = Math.min(a, b);

                System.out.println(max / min);
            } else {
                long max = Math.max(2 * a, b);
                long min = Math.min(2 * a, b);

                System.out.println(max / min);
            }
        }
    }
}

