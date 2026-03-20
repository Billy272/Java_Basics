package DSA.Prefix_Sums;

// This class contains a method to count the number of integers divisible by K within a given range [A, B]
// In real life it can be used in scenarios such as counting the number of 
// multiples of a certain number within a specified range, which can be useful 
// in various applications like scheduling, resource allocation, or any 
// situation where you need to count occurrences of a specific condition within a range.
public class CountDiv {
    public int solution(int A, int B, int K) {
        // Implement your solution here    
        // Calculate the number of integers divisible by K in the range [0, B] and the number of integers divisible by K in the range [0, A-1], and then return the difference between these two counts to get the number of integers divisible by K in the range [A, B]
        int countA = A / K;
        int countB = B / K;
        // The number of integers divisible by K in the range [A, B] is the difference between the count of integers divisible by K in the range [0, B] and the count of integers divisible by K in the range [0, A-1], which is calculated as countB - countA
        int result = countB - countA;

        // If A is divisible by K, we need to include A in the count, so we check if A % K == 0 and increment the result if it is
        if (A % K == 0) {
            result++;
        }

        // Return the final count of integers divisible by K in the range [A, B]
        return result;
    }
}
