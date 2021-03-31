package assignment;
//      Question-3
//      Imports required

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TempleLand {
    public static void main(String[] args) throws IOException {
//      Get user input using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      Read number of tests to be run
        int testCases = Integer.parseInt(br.readLine());
//      Iterate over the no. of test cases using while loop
        while (testCases != 0) {
//      Read no. of strips in each iteration
            int numberOfStrips = Integer.parseInt(br.readLine());
//      Declare array of size same as numberOfStrips
            int[] strips = new int[numberOfStrips];
//      Read values in string seperated by space in a single line
            String[] stringStrips = br.readLine().split(" ");
//      Parse above string values into Integer and update them in array
            for (int i = 0; i < numberOfStrips; i++) {
                strips[i] = Integer.parseInt(stringStrips[i]);
            }
//      check if numberOfStrips is odd and first & last element is 1
            if (numberOfStrips % 2 != 0 && strips[0] == 1 && strips[numberOfStrips - 1] == 1) {
//      Centre value of strip
                int centre = (numberOfStrips - 1) / 2;
//      initialize flag value
                int flag = 0;
                int prev = strips[0];
//      check if elements are incremented by 1 till centre
                for (int i = 1; i <= centre; i++) {
                    if (strips[i] - prev == 1) {
                        prev = strips[i];
                    } else {
//      flag=1 if the difference between two adjacent is not 1 or if element is not incrremented by 1
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    prev = strips[centre];
//      check if elements are decremented by 1 from centre till end
                    for (int i = centre + 1; i < numberOfStrips; i++) {
                        if (prev - strips[i] == 1) {
                            prev = strips[i];
                        } else {
//      flag=1 if the difference between two adjacent is not 1 or if element is not decremented by 1

                            flag = 1;
                            break;
                        }
                    }
                }
                if (flag == 1) {
                    System.out.println("no");
                } else {
                    System.out.println("yes");
                }

            } else {
                System.out.println("no");
            }
//      decrement the testCase value for iterating next test case
            testCases--;
        }
    }
}

