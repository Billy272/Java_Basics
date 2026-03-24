package LeetCode;

// This class implements a solution to construct a product matrix from a given grid.
// In real life, this code can be used in scenarios where you need to
// analyze a grid of values and construct a new matrix where each element 
// is the product of all elements in the original grid except for the current element.
// For example, it could be applied in image processing to create a new image where 
// each pixel is the product of all other pixels, in financial data analysis to 
// compute a new matrix of values based on the products of other values, or 
// in any situation where you need to create a new dataset based on the products 
// of existing values while excluding the current value.
public class ConstProductMatrix {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] p = new int[n][m];
        long currentProduct = 1;
        int mod = 12345;

        // Calculate prefix products
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                p[i][j] = (int) currentProduct;
                currentProduct = (currentProduct * (grid[i][j] % mod)) % mod;
            }
        }

        // Backward pass to multiply by suffix products
        currentProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m -1; j >= 0; j--) {
                p[i][j] = (int) ((p[i][j] * currentProduct) % mod);
                currentProduct = (currentProduct * (grid[i][j] % mod)) % mod;
            }
        }

        return p;
    }
}
