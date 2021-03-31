package assignment;
//      Question-10
//      Imports required

import java.util.*;
import java.lang.*;

public class GrossSalary {
    public static void main(String[] args) throws Exception {
//      Get user input using Scanner class
        Scanner sc = new Scanner(System.in);
        float HRA, DA, Total = 0;
//      Read number of tests to be run
        int testCases = sc.nextInt();
//      Iterate over the no. of test cases using while loop
        while (testCases-- > 0) {
            float Base_Salary = sc.nextInt();
            if (Base_Salary < 1500) {
                HRA = (Base_Salary * 10) / 100;
                DA = (Base_Salary * 90) / 100;
                System.out.println(Base_Salary + HRA + DA);

            } else if (Base_Salary >= 1500) {
                HRA = 500;
                DA = (Base_Salary * 98) / 100;
                Total = Base_Salary + HRA + DA;
                System.out.println(Total);

            }
        }
    }
}

