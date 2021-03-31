package assignment;
//      Question-2
//      Imports required

import java.util.Scanner;

public class OrderingTeams {
    public static void main(String[] args) throws Exception {
//      Get user input using Scanner class
        Scanner sc = new Scanner(System.in);
//      Read number of tests to be run
        int testCases = sc.nextInt();
//      Initialize a counter to count no. of times
        int count = 0;
        for (int iterator = 1; iterator <= testCases; iterator++) {
//      Declare a 2D-Array of size 4 by 3
            int[][] arr = new int[4][3];
//      Iterate over the array and take user input as the elements of array row-wise
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            arr[3][0] = arr[0][0];
            arr[3][1] = arr[0][1];
            arr[3][2] = arr[0][2];
//      Iterate over the array and check the required conditions
            for (int i = 0; i < 3; i++) {
                {
//      Do nothing if all points are equal as atleast i+1th position should at least one more point than ith position
                    if (arr[i][0] == arr[i + 1][0] && arr[i][1] == arr[i + 1][1] && arr[i][2] == arr[i + 1][2]) {
                    } else {
                        if (arr[i][0] >= arr[i + 1][0] && arr[i][1] >= arr[i + 1][1] && arr[i][2] >= arr[i + 1][2]) {
                            count++;
                        } else if (arr[i][0] <= arr[i + 1][0] && arr[i][1] <= arr[i + 1][1] && arr[i][2] <= arr[i + 1][2]) {
                            count++;
                        }
                    }
                }
            }
//      Check the final value of counter and print the value accordingly on console

            if (count == 3)
                System.out.println("yes");
            else
                System.out.println("no");
//      re initialize counter for next iteration
            count = 0;
        }
    }
}

