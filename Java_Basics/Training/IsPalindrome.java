package Training;

public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        s = s.toLowerCase();

        while (left < right) {
            // Skip spaces on left
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            // Skip spaces on right
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        if (isPalindrome(s)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
