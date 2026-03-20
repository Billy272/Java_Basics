import java.util.*;

// This class implements a solution to find the minimum absolute difference

// In real life, this code can be used in scenarios where you need to 
// analyze a grid of values and find the minimum absolute difference
// between distinct values within subgrids of a specified size. 
// For example, it could be applied in image processing to analyze pixel 
// intensity differences, in geographical data analysis to find variations
// in elevation or temperature, or in any situation where you need to 
// compare values within localized regions of a larger dataset. 
// The method `minAbsDiff` takes a 2D grid and an integer `k`, and 
// returns a new 2D array containing the minimum absolute difference 
// for each k x k subgrid within the original grid.
class MinAbsDiff {
    // The `minAbsDiff` method iterates through the grid and calculates 
    // the minimum absolute difference for each k x k subgrid by calling 
    // the `getMinDiff` helper method, which uses a TreeSet to store distinct 
    // values and compute the minimum difference between them efficiently. 
    // The results are stored in a new 2D array that is returned at the end.
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n - k + 1][m - k + 1];

        for (int i = 0; i <= n -k; i++) {
            for (int j = 0; j <= m - k; j++) {
                ans[i][j] = getMinDiff(grid, i, j, k);
            }
        }

        return ans;
    }

    private int getMinDiff(int[][] grid, int startR, int startC, int k) {
        TreeSet<Integer> distinctValues = new TreeSet<>();
        int totalElements = k * k;

        for (int i = startR; i < startR + k; i++) {
            for (int j = startC; j < startC + k; j++) {
                distinctValues.add(grid[i][j]);
            }
        }

        if (distinctValues.size() < totalElements && distinctValues.size() == 1) {
            return 0;
        }

        if (distinctValues.size() <= 1 ) return 0;

        int minDiff = Integer.MAX_VALUE;
        Integer prev = null;
        
        for(int val : distinctValues) {
            if (prev != null) {
                minDiff = Math.min(minDiff, val - prev);
            }
            prev = val;
        }

        return minDiff;
    }
}