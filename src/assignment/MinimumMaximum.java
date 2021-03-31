package assignment;
//      Question-9
//      Imports required

import java.util.*;
import java.lang.*;

public class MinimumMaximum {
    public static void main(String[] args) throws Exception {
//      Get user input using Scanner class
        Scanner sc = new Scanner(System.in);
//      Read number of tests to be run
        int testCases = sc.nextInt();
//      Iterate over the no. of test cases using while loop
        while (testCases-- > 0) {
            long n = sc.nextLong();
            int i;
            long min = Long.MAX_VALUE;
            for (i = 0; i < n; i++) {
                min = Math.min(min, sc.nextLong());
            }
            System.out.println((min * (n - 1)));
        }
    }
}

