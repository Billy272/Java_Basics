package LeetCode;

import java.util.Arrays;

// This class implements a solution to the Walls Destroyed by Robots 
// problem, which is a coding challenge that involves determining the 
// maximum number of walls that can be destroyed by a set of robots. 
// Each robot has a position and a distance it can shoot, and there 
// are walls located at specific positions. The function uses dynamic 
// programming to calculate the maximum number of walls that can be 
// destroyed by considering the contributions of each robot when 
// shooting left or right, as well as the overlap between consecutive 
// robots. The solution also utilizes binary search to efficiently count 
// the number of walls within certain ranges. This can be useful in 
// scenarios such as optimizing resource allocation, planning attacks 
// in strategy games, or any situation where you need to maximize the 
// impact of multiple agents on a set of targets.

public class WallsDestroyedByRobots {
    public int maxWalls(int[] robots, int[] distance, int[] walls) {
        int n = robots.length;

        // Pair robots with their distances
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = robots[i];
            arr[i][1] = distance[i];
        }

        // Sort robots by position
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(walls);

        int[] left = new int[n];
        int[] right = new int[n];
        int[] overlap = new int[n];

        for (int i = 0; i < n; i++) {
            int pos = arr[i][0];
            int dist = arr[i][1];

            // ----- LEFT contribution -----
            int leftBound = pos - dist;
            if (i > 0) {
                leftBound = Math.max(leftBound, arr[i - 1][0] + 1);
            }

            int lIdx = lowerBound(walls, leftBound);
            int rIdx = upperBound(walls, pos);
            left[i] = rIdx - lIdx;

            // ----- RIGHT contribution -----
            int rightBound = pos + dist;
            if (i < n - 1) {
                rightBound = Math.min(rightBound, arr[i + 1][0] - 1);
            }

            int lIdx2 = lowerBound(walls, pos);
            int rIdx2 = upperBound(walls, rightBound);
            right[i] = rIdx2 - lIdx2;

            // ----- OVERLAP between i-1 and i -----
            if (i > 0) {
                int overlapLeft = lowerBound(walls, arr[i - 1][0]);
                int overlapRight = upperBound(walls, pos);
                overlap[i] = overlapRight - overlapLeft;
            }
        }

        // DP states
        int prevLeft = left[0];
        int prevRight = right[0];

        for (int i = 1; i < n; i++) {

            // Current shoots LEFT
            int currLeft = Math.max(
                prevLeft + left[i],
                prevRight - right[i - 1] +
                Math.min(left[i] + right[i - 1], overlap[i])
            );

            // Current shoots RIGHT
            int currRight = Math.max(
                prevLeft + right[i],
                prevRight + right[i]
            );

            prevLeft = currLeft;
            prevRight = currRight;
        }

        return Math.max(prevLeft, prevRight);
    }

    // First index >= target
    private int lowerBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] < target) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    // First index > target
    private int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] <= target) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}