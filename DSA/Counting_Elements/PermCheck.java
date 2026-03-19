package DSA.Counting_Elements;

public class PermCheck {
    public int solution(int[] A) {
        // Implement your solution here
        // Calculate the length of the input array
        int N = A.length;

        // Create a boolean array to keep track of which numbers have been seen in the input array, with a size of N + 1 to account for the numbers from 1 to N
        boolean[] cubbies = new boolean[N + 1];

        // Iterate through the input array to check if it forms a permutation
        for (int block : A) {
            // Check if the current number (block) is greater than N, which means it cannot be part of a valid permutation of numbers from 1 to N
            if (block > N) {
                return 0;
            }

            // Check if the current number (block) has already been seen in the input array, which means it cannot be part of a valid permutation since each number should appear exactly once
            if (cubbies[block] == true) {
                return 0;
            }

            // Mark the current number (block) as seen in the cubbies array
            cubbies[block] = true;
        }

        // If we finish iterating through the input array without finding any duplicates or numbers greater than N, it means the input array forms a valid permutation of numbers from 1 to N, so we return 1 to indicate that it is a permutation
        return 1;
    }
}
