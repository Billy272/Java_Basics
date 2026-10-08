package gpt_class;

public class Anagram {
    String s = "billy";
    String t = "lilby";

    public boolean isAnagram(String s, String t) {

       if (s.length() != t.length()) {
        return false;
       }

       int[] count = new int[26];

       for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
       }

       for (int i = 0; i < s.length(); i++) {
        if (count[s.charAt(i) - 'a'] != 0) {
            return false;
        }
       }

       return true;
    }

    public static void main(String[] args) {
        Anagram obj = new Anagram();
        System.out.println("The two strings are anagrams: " + obj.isAnagram(obj.s, obj.t));
    }
}
