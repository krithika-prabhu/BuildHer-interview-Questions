/*			BuildHer Interview Questions
EASY 1
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
*/
import java.util.*;
public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        // Trim the input string to remove leading and trailing spaces
        s = s.trim();

        // Split the string by spaces and get the last word
        String[] words = s.split(" ");
        String lastWord = words[words.length - 1];

        // Return the length of the last word
        return lastWord.length();
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "Hello World";
        System.out.println("Length of last word in " + s1 + " : " + lengthOfLastWord(s1));

        String s2 = "   fly me   to   the moon  ";
        System.out.println("Length of last word in " + s2 + " : " + lengthOfLastWord(s2));

        String s3 = "luffy is still joyboy";
        System.out.println("Length of last word in " + s3 + " : " + lengthOfLastWord(s3));
    }
}


