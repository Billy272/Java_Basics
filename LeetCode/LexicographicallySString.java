package LeetCode;

import java.util.*;

// This class implements a solution to the problem of generating a 
// lexicographically smallest string based on two input strings 
// (str1 and str2). The function takes two strings as input, where 
// str1 contains characters 'T' and 'F', and str2 contains lowercase 
// letters. The goal is to create a new string that satisfies the 
// conditions specified by str1: for each character 'T' in str1, the 
// corresponding characters in the generated string must match the 
// characters in str2 at the same positions; for each character 'F' 
// in str1, the corresponding characters in the generated string must 
// not match the characters in str2 at the same positions. The function 
// returns the lexicographically smallest string that meets these 
// conditions, or an empty string if it is not possible to satisfy the 
// conditions. This can be useful in scenarios such as string manipulation, 
// data validation, or any situation where you need to generate a specific
//  string based on certain constraints.

public class LexicographicallySString {
    public:
        String generateString(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int totalLen = n + m - 1;
        char[] ans = new char[totalLen];
        Arrays.fill(ans, '?');
        boolean[] fixed = new boolean[totalLen];

        // Satisfy T conditions
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    if (fixed[i + j] && ans[i + j] != str2.charAt(j)) return "";
                    ans[i + j] = str2.charAt(j);
                    fixed[i + j] = true;
                }
            }
        }

        // Preliminary smallest fill
        for (int i = 0; i < totalLen; i++) {
            if (ans[i] == '?') ans[i] = 'a';
        }

        // Satisfy 'F' conditions
        for (int i = 0; i < n; ++i) {
            if (str1.charAt(i) == 'F') {
                boolean match = true;
                for (int j = 0; j < m; ++j) {
                    if (ans[i + j] != str2.charAt(j)) {match = false; break; }
                }

                if (match) {
                    boolean changed = false;

                    for (int j = m -1; j >= 0; --j) {
                        if (!fixed[i + j]) {
                            ans[i + j] = 'b';
                            changed = true;
                            break;
                        }
                    }
                    if (!changed) return "";
                }
            }
        }

        return new String(ans);
    }
};