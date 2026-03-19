package DSA.Arrays;

public class OddOccurrence {
    public int solution(int[] A) {
        // Implement your solution here
        // Initialize a variable to store the result of the XOR operation
        int result = 0;

        // Iterate through the input array and perform the XOR operation on each element
        for (int number : A) {
            // Perform the XOR operation between the current result and the current number
            result ^= number;
        }

        // Return the result, which will be the number that occurs an odd number of times
        return result;
    }
}