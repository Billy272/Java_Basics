package DSA.Time_Complexity;

public class TapeEquilibrium {
    public int solution(int[] A) {
        // Implement your solution here
        // Calculate the total sum
        long totalSum = 0;
        // Iterate through the input array and calculate the total sum of its elements
        for (int num : A) {
            // Add the current number to the total sum
            totalSum += num;
        }

        // Initialize a variable to store the minimum difference found so far, starting with the maximum possible value
        long minDifference = Long.MAX_VALUE;
        // Initialize a variable to store the sum of the left part of the tape, starting with 0
        long leftSum = 0;

        // Iterate through the input array to calculate the difference between the left and right parts of the tape at each possible split point
        for (int i = 0; i < A.length; i++) {
            // Add the current element to the left sum
            leftSum += A[i];
            long rightSum = totalSum - leftSum;
            long currentDiff = Math.abs(leftSum  - rightSum);

            // If the current difference is smaller than the minimum difference found so far, update the minimum difference
            if (currentDiff < minDifference) {
                // Update the minimum difference to the current difference
                minDifference = currentDiff;
            }
        }
        // Return the minimum difference found, cast to an integer
        return (int) minDifference;
    }
}
