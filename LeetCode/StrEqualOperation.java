package LeetCode;

// This class implements a solution to the problem of determining whether 
// two strings can be made equal by swapping characters at even and odd 
// indices. The function takes two strings (s1 and s2) as input, where 
// both strings are of length 4. The solution checks if the characters 
// at even indices (0 and 2) of s1 can be swapped to match the characters 
// at even indices of s2, and if the characters at odd indices (1 and 3) 
// of s1 can be swapped to match the characters at odd indices of s2. If 
// both conditions are satisfied, the function returns true, indicating 
// that the two strings can be made equal; otherwise, it returns false. 
// This can be useful in scenarios such as string manipulation, 
// data validation, or any situation where you need to determine 
// if two strings can be made identical through specific character swaps.   

public class StrEqualOperation {
    public boolean canBeEqual(String s1, String s2) {
        // Group 1 of even indices 0 and 2
        char s1_0 = s1.charAt(0), s1_2 = s1.charAt(2);
        char s2_0 = s2.charAt(0), s2_2 = s2.charAt(2);

        // Group 2 of odd indices 1 and 3
        char s1_1 = s1.charAt(1), s1_3 = s1.charAt(3);
        char s2_1 = s2.charAt(1), s2_3 = s2.charAt(3);

        boolean evenMatch = (s1_0 == s2_0 && s1_2 == s2_2) || (s1_0 == s2_2 && s1_2 == s2_0);

        boolean oddMatch = (s1_1 == s2_1 && s1_3 == s2_3) || (s1_1 == s2_3 && s1_3 == s2_1);

        return evenMatch && oddMatch;
    }
}
