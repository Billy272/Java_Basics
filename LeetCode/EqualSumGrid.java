package LeetCode;

// This class implements a solution to the Equal Sum Grid problem, which 
// is a common coding challenge that asks whether a given 2D grid of integers 
// can be partitioned into two parts with equal sums by making a single 
// horizontal or vertical cut. The function calculates the total sum of 
// all elements in the grid and checks if it is even, as an odd total 
// cannot be partitioned into two equal parts. Then, it iterates through 
// possible horizontal and vertical cuts, calculating the sum of the 
// respective partitions and comparing it to half of the total sum. 
// If a valid cut is found that results in equal sums, the function returns 
// true; otherwise, it returns false after checking all possible cuts. 
// This can be useful in scenarios such as data analysis, image processing, 
// or any situation where you need to determine if a dataset can be evenly 
// split based on certain criteria.

public class EqualSumGrid {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long totalSum = 0;

        // Calculate total sum
        for ( int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                totalSum += grid[i][j];
            }
        }

        if (totalSum % 2 != 0) return false;
        long target = totalSum / 2;

        // Check horizontal cuts
        long rowSum = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++ ) {
                rowSum += grid[i][j];
            }
            if (rowSum == target) return true;
        }

        // Check vertical cuts
        long colSum = 0;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < m; i++) {
                colSum += grid[i][j];
            }
            if (colSum == target) return true;
        }

        return false;
    }
}
