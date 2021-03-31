package assignment;
//      Question-5
//      Imports required

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulArray {
    public static void main(String[] args) {
//      Get user input using Scanner class
        Scanner sc = new Scanner(System.in);
//      Read number of tests to be run
        int testCases = sc.nextInt();
//      Iterate over the no. of test cases
        for (int tc = 0; tc < testCases; tc++) {
//      User input denoting number of elements in an array
            int n = sc.nextInt();
//      Declare an array of size n
            int[] arr = new int[n];
//      Take the user input and add them in array element
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
//      Calling checkBeautiful() function and printing the output
            System.out.println(checkBeautiful(arr) ? "yes" : "no");
        }
        sc.close();
    }

    //      Method definition for checking if array is beautiful
    static boolean checkBeautiful(int[] a) {
//      Recursive Method calling for checking count for 0,1,-1 and other numbers
        int zeroCount = count(a, 0);
        int positiveOneCount = count(a, 1);
        int negativeOneCount = count(a, -1);
        int otherCount = a.length - zeroCount - positiveOneCount - negativeOneCount;

        return otherCount <= 1 && (otherCount == 0 || negativeOneCount == 0)
                && (negativeOneCount <= 1 || positiveOneCount >= 1);
    }

    //      Recursive Method definition returns number of times any particular element occured in an array
    static int count(int[] a, int target) {
        return (int) Arrays.stream(a).filter(x -> x == target).count();
    }
}