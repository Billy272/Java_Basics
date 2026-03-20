package DSA.Prefix_Sums;

// In real life, the MinAvgTwoSlice problem can be used in scenarios such as 
// analyzing financial data to find the period with the lowest average return, 
// or in performance analysis to identify the time frame with the lowest 
// average response time. It can also be applied in quality control to 
// find the batch of products with the lowest average defect rate, or in 
// sports analytics to determine the period with the lowest average score 
// for a team or player.
public class MinAvgTwoSlice {
    public int solution(int[] A) {
        // Implement your solution here
        // The function takes an array of integers A as input and returns the starting index of the slice with the minimum average
        int N  = A.length;
        double minAvg = Double.MAX_VALUE;
        int minIndex = 0;

        // Iterate through the input array and calculate the average of each slice of length 2 and 3, updating the minimum average and its starting index as needed
        for (int i = 0; i < N - 1; i++) {
            double avg2 = (A[i] + A[i + 1]) / 2.0;
            // If the average of the current slice of length 2 is less than the minimum average found so far, update the minimum average and its starting index
            if (avg2 < minAvg) {
                minAvg = avg2;
                minIndex = i;
            }

            // Check if the current index allows for a slice of length 3, and if so, calculate its average and compare it to the minimum average found so far
            if (i < N - 2) {
                double avg3 = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
                // If the average of the current slice of length 3 is less than the minimum average found so far, update the minimum average and its starting index
                if (avg3 < minAvg) {
                    minAvg = avg3;
                    minIndex = i;
                }
            }
        }

        return minIndex;
    }
}
