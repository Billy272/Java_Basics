package DSA.Leader;

// This class implements a solution to the Dominator problem, which is a 
// common coding interview question. The function takes an array of integers 
// (A) as input and returns the index of any element that is a dominator in 
// the array. A dominator is an element that appears more than half the time 
// in the array.

// The solution uses the Boyer-Moore majority vote algorithm to find a 
// candidate for the dominator. It then performs a background check to count 
// how many times the candidate appears in the array.

// In real projects, this algorithm can be useful in scenarios such as:
// 1. Data Analysis: To identify the most common element in a dataset, which
//    can be useful for tasks like market research, user behavior analysis, or
//    any situation where you need to find a majority element.
// 2. Voting Systems: To determine the winner in a voting system where a 
//    majority is required, such as in elections or decision-making processes.
// 3. Performance Optimization: To optimize performance in cases where you 
//    need to quickly identify a dominant element in a large dataset, which can
//    be useful in fields like machine learning, natural language processing, or 
//    any situation where you need to identify a prevalent feature or characteristic in data.

public class Dominator {
    public int solution(int[] A) {
        // Handle empty arrays
        if (A.length == 0) return -1;

        // Elimination Game
        int candidate = -1;
        int strength = 0;

        for (int value : A) {
            if (strength == 0) {
                candidate = value;
                strength = 1;
            } else if (value == candidate) {
                strength++;
            } else {
                strength--;
            }
        }

        // Background check
        int actualCount = 0;
        int firstIndex = -1;

        for ( int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                actualCount++;
                // Save the index to be returned later
                if (firstIndex == -1) firstIndex = i;
            }
        }

        // The final verdict
        if (actualCount > A.length / 2) {
            return firstIndex;
        } else {
            return -1;
        }
    }
}
