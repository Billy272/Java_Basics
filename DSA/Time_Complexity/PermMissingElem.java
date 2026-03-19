package DSA.Time_Complexity;

public class PermMissingElem {
    // Implement your solution here
    // The function takes an array of integers A as input and returns the missing element in the array
    public int solution(int[] A) {
        // Implement your solution here
        // Calculate the length of the input array
        long n = A.length;

        // Calculate the target length of the array if it were complete
        long targetN = n + 1;

        // Calculate the expected sum of all elements in a complete array
        long expectedSum = (targetN * (targetN + 1)) / 2;

        // Calculate the actual sum of elements in the input array
        long actualSum = 0;
        // Iterate through the input array and calculate the sum of its elements
        for (int number : A) {
            // Add the current number to the actual sum
            actualSum += number;
        }

        // The missing element is the difference between the expected sum and the actual sum
        return (int) (expectedSum - actualSum);
    }
}
