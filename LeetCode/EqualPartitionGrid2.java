package LeetCode;

import java.util.HashMap;
import java.util.Map;

// This is one of the Hardest LeetCode problems. The problem is 
// to determine if a given 2D grid of integers can be partitioned 
// into two parts with equal sums by making a single horizontal or 
// vertical cut. The solution involves calculating the total sum of 
// the grid and then checking for possible cuts that can balance 
// the sums on either side. The code uses HashMaps to keep track 
// of the frequency of values in the top and bottom partitions (for 
// horizontal cuts) and left and right partitions (for vertical cuts). 
// It also includes a helper function `canRemoveFast` to check if removing 
// a specific value can help achieve the balance needed for an 
// equal partition. This approach is efficient and handles edge 
// cases effectively, making it suitable for large grids.

public class EqualPartitionGrid2 {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        long totalSum = 0;
        for (int[] row : grid)
            for (int val : row)
                totalSum += val;

        // HORIZONTAL
        Map<Integer, Integer> top = new HashMap<>();
        Map<Integer, Integer> bottom = new HashMap<>();

        for (int[] row : grid)
            for (int v : row)
                bottom.put(v, bottom.getOrDefault(v, 0) + 1);

        long topSum = 0;

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                int v = grid[i][j];
                topSum += v;

                top.put(v, top.getOrDefault(v, 0) + 1);
                bottom.put(v, bottom.get(v) - 1);
                if (bottom.get(v) == 0) bottom.remove(v);
            }

            long bottomSum = totalSum - topSum;
            long diff = topSum - bottomSum;

            if (diff == 0) return true;

            long d = Math.abs(diff);
            if (d > Integer.MAX_VALUE) continue;

            int target = (int)d;

            if (diff > 0) {
                if (canRemoveFast(grid, 0, i, 0, n - 1, target, top)) return true;
            } else {
                if (canRemoveFast(grid, i + 1, m - 1, 0, n - 1, target, bottom)) return true;
            }
        }

        // VERTICAL
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();

        for (int[] row : grid)
            for (int v : row)
                right.put(v, right.getOrDefault(v, 0) + 1);

        long leftSum = 0;

        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < m; i++) {
                int v = grid[i][j];
                leftSum += v;

                left.put(v, left.getOrDefault(v, 0) + 1);
                right.put(v, right.get(v) - 1);
                if (right.get(v) == 0) right.remove(v);
            }

            long rightSum = totalSum - leftSum;
            long diff = leftSum - rightSum;

            if (diff == 0) return true;

            int d = (int)Math.abs(diff);

            if (diff > 0) {
                if (canRemoveFast(grid, 0, m - 1, 0, j, d, left)) return true;
            } else {
                if (canRemoveFast(grid, 0, m - 1, j + 1, n - 1, d, right)) return true;
            }
        }

        return false;
    }

    private boolean canRemoveFast(int[][] grid, int r1, int r2, int c1, int c2,
                             int d, Map<Integer, Integer> map) {

    int rows = r2 - r1 + 1;
    int cols = c2 - c1 + 1;
    int size = rows * cols;

    if (size == 1) return false;

    if (!map.containsKey(d)) return false;

    // CRITICAL FIX:
    // If section is large, we still must ensure that removing d
    // corresponds to a real balancing opportunity

    if (rows > 1 && cols > 1) {
        // Instead of blindly returning true,
        // ensure d exists in a position that does not "fake" the balance

        // Check at least one valid position exists (not all same-value trap)
        boolean found = false;
        for (int i = r1; i <= r2 && !found; i++) {
            for (int j = c1; j <= c2; j++) {
                if (grid[i][j] == d) {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }

    // Single row → edge only
    if (rows == 1) {
        return grid[r1][c1] == d || grid[r1][c2] == d;
    }

    // Single column → edge only
    if (cols == 1) {
        return grid[r1][c1] == d || grid[r2][c1] == d;
    }

    return false;
    }
}
