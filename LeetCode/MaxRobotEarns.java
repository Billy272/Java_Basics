package LeetCode;

public class MaxRobotEarns {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;

        int[][][] dp = new int[m][n][3];

        // Initialize with a very small number
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k ++) {
                    dp[i][j][k] = Integer.MIN_VALUE / 2;
                }
            }
        }

        // Start point
        dp[0][0][0] = coins[0][0];
        if (coins[0][0] < 0) {
            dp[0][0][1] = 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i == 0 && j == 0) continue;

                    int prevMax = Integer.MIN_VALUE / 2;

                    // Come from top or left
                    if (i > 0) prevMax = Math.max(prevMax, dp[i - 1][j][k]);
                    if (j > 0) prevMax = Math.max(prevMax, dp[i][j - 1][k]);

                    if (prevMax != Integer.MIN_VALUE / 2) {
                        dp[i][j][k] = Math.max(dp[i][j][k], prevMax + coins[i][j]);
                    }

                    if (k > 0) {
                        int prevMaxPrevK = Integer.MIN_VALUE / 2;
                        if (i > 0) prevMaxPrevK = Math.max(prevMaxPrevK, dp[i - 1][j][k - 1]);
                        if (j > 0) prevMaxPrevK = Math.max(prevMaxPrevK, dp[i][j - 1][k - 1]);

                        if (prevMaxPrevK != Integer.MIN_VALUE / 2) {
                            dp[i][j][k] = Math.max(dp[i][j][k], prevMaxPrevK + Math.max(0, coins[i][j]));
                        }
                    }
                }
            }
        }

        return Math.max(dp[m - 1][n - 1][0], Math.max(dp[m - 1][n - 1][1], dp[m - 1][n - 1][2]));
    }
}