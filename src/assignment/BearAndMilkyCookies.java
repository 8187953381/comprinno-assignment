package assignment;
//      Question-4
//      Imports required

import java.util.Scanner;

public class BearAndMilkyCookies {
    public static void main(String[] args) throws Exception {
//      Get user input using Scanner class
        Scanner sc = new Scanner(System.in);
//      Read number of tests to be run
        int testCases = sc.nextInt();
//      Iterate over the no. of test cases
        for (int i = 0; i < testCases; i++) {
//      Take the boolean value for for assuming next bear drinks milk
            boolean nextMilk = true;
//      User input for how many minutes it spend in kitchen
            int n = sc.nextInt();
//      Declare an string array of size n minutes
            String[] bear = new String[n];
            for (int j = 0; j < n; j++) {
//      add what bear ate in each minute
                bear[j] = sc.next();
            }
//      loop over the number of minutes
            for (int k = 0; k < n - 1; k++) {
//      check if cookie is eaten in cosecutive minutes
                if (bear[k].equals("cookie") && bear[k + 1].equals("cookie")) {
                    nextMilk = false;
                    break;
                }
            }
//      print yes if nextMilk is true and if last elemnt is not cookie
            if (nextMilk && !bear[n - 1].equals("cookie")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

