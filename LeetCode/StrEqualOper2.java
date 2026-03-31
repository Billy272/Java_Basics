package LeetCode;

// This class implements a solution to the problem of determining whether
// two strings can be made equal by swapping characters at even and odd
// indices. The function takes two strings (s1 and s2) as input, where
// both strings are of length 4. The solution checks if the characters
// at even indices (0 and 2) of s1 can be swapped to match the
// characters at even indices of s2, and if the characters at odd indices (1 and 3)
// of s1 can be swapped to match the characters at odd indices of s2. If
// both conditions are satisfied, the function returns true, indicating
// that the two strings can be made equal; otherwise, it returns false.
// This can be useful in scenarios such as string manipulation,
// data validation, or any situation where you need to determine
// if two strings can be made identical through specific character swaps.

public class StrEqualOper2 {
    public boolean checkStrings(String s1, String s2) {
        int[] evenCount1 = new int[26];
        int[] oddCount1 = new int[26];
        int[] evenCount2 = new int[26];
        int[] oddCount2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                evenCount1[s1.charAt(i) - 'a']++;
                evenCount2[s2.charAt(i) - 'a']++;
            } else {
                oddCount1[s1.charAt(i) - 'a']++;
                oddCount2[s2.charAt(i) - 'a']++;
            }
        }

        // Compare the frequency dist.
        for (int i = 0; i < 26; i++) {
            if (evenCount1[i] != evenCount2[i] || oddCount1[i] != oddCount2[i]) {
                return false;
            }
        }

        return true;
    }
}
