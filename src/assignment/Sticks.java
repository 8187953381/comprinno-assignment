package assignment;
//      Question-7
//      Imports required

import java.util.*;

public class Sticks {
    public static void main(String[] args) throws Exception {
//      Get user input using Scanner class
        Scanner sc = new Scanner(System.in);
//      Read number of tests to be run
        int testCases = sc.nextInt();
        while (testCases-- > 0) {
//      User input denoting number of elements in an array
            int n = sc.nextInt();
//      Declare an array of size n
            int[] arr = new int[n];
//      Take the user input and add them in array element
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
//      Sort the array
            Arrays.sort(arr);
            int c1 = 0, c2 = 0, length = 0, breadth = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (c1 == 2 && c2 == 2) {
                    break;
                } else if (c1 == 0 && c2 == 0) {
                    length = arr[i];
                    c1++;
                } else if (c1 == 1 && arr[i] == length) {
                    c1++;

                } else if (c1 >= 2 && arr[i] == length) {
                    c1++;
                } else if (c1 >= 2 && arr[i] != length && c2 == 0) {
                    c2++;
                    breadth = arr[i];
                } else if (c2 == 1 && arr[i] == breadth) {
                    c2++;
                } else if (c2 >= 2 && arr[i] == breadth) {
                    c2++;
                } else if (c1 == 1 && arr[i] != length) {
                    length = arr[i];
                } else if (c2 == 1 && arr[i] != breadth) {
                    breadth = arr[i];
                }
            }
            if (c1 >= 4) System.out.println(length * length);
            else if (c1 >= 2 && c2 >= 2) System.out.println(length * breadth);

            else System.out.println("-1");
        }
    }
}
