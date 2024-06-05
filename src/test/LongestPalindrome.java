package test;

import java.util.Scanner;

/*
 * Given a string s which consists of lowercase or uppercase letters, 
 * return the length of the longest palindrome that can be built with those letters.
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome.
 */
public class LongestPalindrome {

	public static int longestPalindrome(String s) {
        int length = s.length();
		return length;
    }
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
        
        
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        
        scanner.close();
	}

}
