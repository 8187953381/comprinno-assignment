package assignment;
//      Question-6
//      Imports required
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CatsAndDogs {
    public static void main(String[] args) throws Exception {
//      Get user input using BufferedReader class
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
//      Read number of tests to be run
        int testCases = Integer.parseInt(br.readLine());
//      Iterate over the no. of test cases using for loop
        for (int i = 0; i < testCases; i++) {
            String[] input;
            long cats, dogs, legs;
//      Read no. of cats,dogs and legs in each iteration in a single line
            input = br.readLine().split(" ");
//      Differentiate no. of cats,dogs and legs

            cats = Long.parseLong(input[0]);
            dogs = Long.parseLong(input[1]);
            legs = Long.parseLong(input[2]);
//      max no. of legs when both cat and dogs feet are on land
            long maxLegs = (cats + dogs) * 4;
//      max no. of legs when one or more cats lie on the back of dogs
            long minLegs = ((cats - dogs * 2) > 0) ? ((cats - dogs * 2) * 4 + dogs * 4) : dogs * 4;
            if (legs % 4 == 0) {
                if (legs >= minLegs && legs <= maxLegs)
                    System.out.println("yes");
                else
                    System.out.println("no");
            } else
                System.out.println("no");
        }
    }
}

