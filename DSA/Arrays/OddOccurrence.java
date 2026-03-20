package DSA.Arrays;

// This is used in scenarios where you have an array of integers 
// and you want to find the integer that occurs an odd number of times.
// For example, if you have an array [9, 3, 9, 3, 9, 7, 9], the function will return 7, 
// since 7 is the only number that occurs an odd number of times (1 time), while all 
// other numbers occur an even number of times (4 times for 9 and 2 times for 3).
// This can be useful in various applications such as data analysis, error detection,
// or any situation where you need to identify an element that has a unique occurrence
// pattern in a dataset.
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