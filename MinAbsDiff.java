import java.util.*;

class MinAbsDiff {
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