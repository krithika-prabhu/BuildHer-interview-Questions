/*		BuildHer Interview Questions
Hard 2
You are given a string s. You can convert s to a palindrome by adding characters in front of it.
Return the shortest palindrome you can find by performing this transformation.
*/

import java.util.*;
public class ShortestPalindrome {
    public static String shortestPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        // Find the longest palindrome starting from the beginning of the string
        while (j >= 0) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
            j--;
        }

        // If the whole string is a palindrome, no need to add anything
        if (i == s.length()) {
            return s;
        }

        // Construct the shortest palindrome by adding the reverse of the remaining substring to the beginning
        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String middle = shortestPalindrome(s.substring(0, i));

        return prefix + middle + suffix;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "aacecaaa";
        System.out.println("Shortest palindrome for \"" + s1 + "\": " + shortestPalindrome(s1));

        String s2 = "abcd";
        System.out.println("Shortest palindrome for \"" + s2 + "\": " + shortestPalindrome(s2));
    }
}
