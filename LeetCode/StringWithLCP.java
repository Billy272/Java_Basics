package LeetCode;

import java.util.HashMap;
import java.util.Map;

// This class implements a solution to the problem of finding a string that
// corresponds to a given longest common prefix (LCP) matrix. The function
// `findTheString` takes a 2D integer array (lcp) as input, where lcp[i][j]
// represents the length of the longest common prefix between the suffixes of
// the string starting at indices i and j. The method uses a union-find (disjoint
// set) data structure to group indices that share the same character based on
// the LCP values. It then assigns characters to each group, ensuring that the
// resulting string satisfies the LCP conditions. Finally, it verifies that the
// constructed string matches the LCP matrix, returning the string if valid or
// an empty string if no valid string can be formed. This approach efficiently
// handles the constraints of the problem while ensuring correctness.

public class StringWithLCP {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (lcp[i][j] > 0) {
                    union(parent, i, j);
                }
            }
        }

        char[] s = new char[n];
        char currChar = 'a';
        Map<Integer, Character> groupToChar = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int root = find(parent, i);
            if (!groupToChar.containsKey(root)) {
                if (currChar > 'z') return "";
                groupToChar.put(root, currChar++);
            }
            s[i] = groupToChar.get(root);
        }

        int[][] check = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (s[i] == s[j]) {
                    check[i][j] = check[i + 1][j + 1] + 1;
                } else {
                    check[i][j] = 0;
                }
                if (check[i][j] != lcp[i][j]) return "";
            }
        }

        return new String(s);
    }

    private int find(int[] parent, int i) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent, parent[i]);
    }

    private void union(int[] parent, int i, int j) {
        int rootI = find(parent, i);
        int rootJ = find(parent, j);
        if (rootI != rootJ) parent[rootI] = rootJ;
    }
}
