package edu.crackingpt1;

public class Application {

	public static void main(String[] args) {
		ChapterOne ch1 = new ChapterOne();
		
		// Algorithm 1: Check if string contains unique characters
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("1. "+ch1.uniqueChars(str1));
		
		// Algorithm 2: Reversal of a string
		String str2 = "abcd";
		System.out.println("2. "+ch1.strReverse(str2));
		
		// Algorithm 3: Remove duplicate characters
		String str3 = "sumanthkulkarni";
		System.out.println("3. "+ch1.removeDupe(str3));
		
		// Algorithm 4: Anagrams or not
		String str4 = "anagram";
		String str5 = "margana";
		
		if (ch1.anagramOrNot(str4, str5)) {
			System.out.println("The strings are anagrams!");
		} else {
			System.out.println("The strings are not anagrams!");
		}
		
		// Algorithm 5: String replacement
		String str6 = "This is a test string for string replacement.";
		System.out.println("The replaced white spaces would yield: "+ch1.spaceReplacement(str6));
	}
}
