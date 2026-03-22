package LeetCode;

// This class implements a solution to determine if one matrix can be obtained by rotating another matrix by 90 degrees, 180 degrees, or 270 degrees. The function `findRotation` takes two 2D arrays (matrices) as input and checks if the first matrix can be rotated to match the second matrix in any of the four possible orientations (0 degrees, 90 degrees, 180 degrees, and 270 degrees). The function returns true
// It is best used in projects like:
// 1. Image Processing: When you need to determine if two images are the same but one is rotated.
// 2. Game Development: In games where you need to check if a game board or puzzle piece can be rotated to fit a certain configuration.
// 3. Robotics: When you need to determine if a robot's sensor data matches a known pattern, regardless of orientation.
// 4. Data Analysis: When you need to compare datasets that may have been rotated or rearranged in some way,
public class MatrixByRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean rot0 = true, rot90 = true, rot180 = true, rot270 = true;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) rot0 = false;

                if (mat[i][j] != target[j][n - 1 - i]) rot90 = false;

                if (mat[i][j] != target[n - 1 - i][n - 1 - j]) rot180 = false;

                if (mat[i][j] != target[n - 1 - j][i]) rot270 = false;
            }
        }

        return rot0 || rot90 || rot180 || rot270;
    }
}
