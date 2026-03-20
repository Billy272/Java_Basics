package DSA.Counting_Elements;

import java.util.HashSet;
import java.util.Set;

// This class implements a solution to the Missing Integer problem, 
// which is a common coding challenge that asks for the smallest 
// positive integer that is missing from a given array of integers. 
// The function iterates through the input array, collects all positive 
// integers in a set, and then checks for the smallest positive integer 
// that is not present in the set, returning that value as the result.
// For example, if the input array is [1, 2, 3], the function will return 4, 
// since 4 is the smallest positive integer that is not present in the array.
// It is best used in proects like data validation, where you need to ensure 
// that a sequence of positive integers is complete and identify any missing values.
public class MissingInteger {
    public int solution(int[] A) {
        // Implement your solution here
        // Create a set to store the positive integers that have been seen in the input array
        Set<Integer> seenNumbers = new HashSet<>();

        // Iterate through the input array and add all positive integers to the set of seen numbers
        for (int num : A) {
            // Check if the current number is greater than 0, which means it's a positive integer that we want to track in the set of seen numbers
            if (num > 0) {
                seenNumbers.add(num);
            }
        }

        // Initialize a variable to keep track of the smallest positive integer that is missing from the set of seen numbers, starting with 1
        int missingValue = 1;
        // Use a while loop to check if the current missing value is present in the set of seen numbers, and if it is, increment the missing value until we find a value that is not present in the set
        while (seenNumbers.contains(missingValue)) {
            missingValue++;
        }

        // Return the smallest positive integer that is missing from the set of seen numbers, which is the value of missingValue after the while loop finishes
        return missingValue;
    }
}
