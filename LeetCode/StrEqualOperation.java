package LeetCode;

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
