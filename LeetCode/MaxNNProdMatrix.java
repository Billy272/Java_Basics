package LeetCode;

public class MaxNNProdMatrix {
    public int maxProductPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long mod = 1_000_000_007L;

        // I use long to prevent overflow on calculations
        long[][] maxProd = new long[m][n];
        long[][] minProd = new long[m][n];

        // Initialize starting point
        maxProd[0][0] = minProd[0][0] = grid[0][0];

        // Initialize first column
        for (int i = 1; i < m; i++) {
            maxProd[i][0] = minProd[i][0] = maxProd[i - 1][0] * grid[i][0];
        }

        // Initialize first row
        for (int j = 1; j < n; j++) {
            maxProd[0][j] = minProd[0][j] = maxProd[0][j - 1] * grid[0][j];
        } 

        // Fill the DP tables (start from 1,1 since first row and col are initialized)
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                long a = maxProd[i - 1][j] * grid[i][j];
                long b = minProd[i - 1][j] * grid[i][j];
                long c = maxProd[i][j - 1] * grid[i][j];
                long d = minProd[i][j - 1] * grid[i][j];

                maxProd[i][j] = Math.max(Math.max(a, b), Math.max(c, d));
                minProd[i][j] = Math.min(Math.min(a, b), Math.min(c, d));
            }
        }

        long res = maxProd[m - 1][n - 1];
        return res < 0 ? -1 : (int) (res % mod);

    }
}
