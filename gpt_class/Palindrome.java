package gpt_class;

public class Palindrome {
    
    String word = "APanama";

    public boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        word = word.toLowerCase();

        while (left < right) {

            if (!Character.isLetterOrDigit(word.charAt(left))){
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(word.charAt(right))) {
                right--;
                continue;
            }

            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println("The sentence is a palindrome: "+ obj.isPalindrome(obj.word));
    }
}
