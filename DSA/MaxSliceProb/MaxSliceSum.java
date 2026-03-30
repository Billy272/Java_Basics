package DSA.MaxSliceProb;

// This class implements a solution to the Max Slice Sum problem, which is a
// common coding challenge that asks for the maximum sum of a contiguous subarray
// within a given array of integers. The function uses Kadane's algorithm, which
// iterates through the array while keeping track of the maximum sum of a subarray
// that ends at the current index and the overall maximum sum found so far. This
// can be useful in scenarios such as financial analysis, signal processing, or any
// situation where you need to find the maximum sum of a contiguous segment of data.

// In real projects, this algorithm can be useful in scenarios such as:
// 1. Financial Analysis: To analyze stock price changes and identify the best
//    period for maximum profit based on price fluctuations.
// 2. Signal Processing: To find the maximum energy segment in a signal, which
//    can be useful in applications like audio processing, image analysis, or any
//    situation where you need to identify the most significant segment of data.
// 3. Data Analysis: To identify the most significant contiguous segment in a dataset,
//    which can be useful in various applications such as market research, user
//    behavior analysis, or any situation where you need to find the most 
//    impactful segment of data for decision-making or insights.

public class MaxSliceSum {
    public int solution(int[] A) {
        // Implement your solution here
        long maxEndingHere = A[0];
        long maxSoFar = A[0];

        for (int i = 1; i < A.length; i++) {
            maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);

            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return (int) maxSoFar;
    }
}
