package LeetCode;

// This class implements a solution to the problem of determining whether 
// a given 2D matrix is similar to itself after performing a cyclic shift 
// of its columns by a specified number of positions (k). The function 
// `areSimilar` takes a 2D integer array (matrix) and an integer k as 
// input and checks if the matrix remains unchanged after shifting 
// its columns to the right by k positions. 
// The method first calculates the effective shift by taking k modulo 
// the number of columns (n) to handle cases where k is greater than n. 
// It then iterates through each element of the matrix and compares it 
// with the corresponding element in the shifted position. If any element 
// does not match, the function returns false, indicating that the matrix 
// is not similar after the shift. If all elements match, it returns true, 
// indicating that the matrix is similar after the cyclic shift. 
// This approach efficiently checks for similarity without needing to 
// create a new shifted matrix, thus optimizing space complexity.
public class MatrixSimilCyclic {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        k = k % n;

        if (k == 0) return true;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != mat[i][(j + k) % n]) {
                    return false;
                }
            }
        }

        return true;
    }
}

