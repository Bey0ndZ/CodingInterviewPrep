package edu.crackingpt1;

import java.util.Arrays;

public class ChapterOne {
	// Algorithm 1
	public boolean uniqueChars(String str) {
		char[] charArray = str.toCharArray();
		boolean flag = false;
		char initChar = charArray[0];
		for (int j = 1; j < charArray.length; j++) {
			if (initChar == charArray[j]) {
				flag = false;
				return flag;
			} else {
				flag = true;
			}
		}
		return flag;
	}

	// Algorithm 2
	public String strReverse(String str) {
		StringBuffer reverse = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse.append(str.charAt(i));
		}
		return reverse.toString();
	}

	// Algorithm 3
	public String removeDupe(String str) {
		char[] charArray = str.toCharArray();
		StringBuffer buffer = new StringBuffer();
		String tempStr = "";

		for (int i = 0; i < charArray.length; i++) {
			for (int j = 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					// duplicate
				} else {
					// unique
				}
			}
		} 
		return buffer.toString();
	}
	
	// Algorithm 4
	public boolean anagramOrNot(String str1, String str2) {
		char[] str1CharArray = str1.toCharArray();
		char[] str2CharArray = str2.toCharArray();
		boolean flag = false;
		
		if (str1.length() == str2.length()) {
			for (int i=0; i<str1CharArray.length; i++) {
				for (int j=0; i<str2CharArray.length; j++) {
					if (str1CharArray[i] == str2CharArray[j]) {
						flag = true;
						break;
					} 
				}
			}
		} 
		return flag;
	}
	
	// Algorithm 5: String replacement
	public String spaceReplacement(String str) {
		char[] charArray = str.toCharArray();
		int whiteSpaceCount = 0;
		
		for (int i=0; i<charArray.length; i++) {
			if (charArray[i] == ' ') {
				whiteSpaceCount++;
			}
		}
		
		char[] removeWhiteSpaceCharArray = new char[charArray.length+whiteSpaceCount*3];
		
		int i = 0;
		int j = 0;
		while (i < charArray.length) {
			if (charArray[i] == ' ') {
				removeWhiteSpaceCharArray[j] = '%';
				removeWhiteSpaceCharArray[j+1] = '2';
				removeWhiteSpaceCharArray[j+2] = '0';
				i++;
				j=j+3;
				
			} else {
				removeWhiteSpaceCharArray[j] = charArray[i];
				i++;
				j++;
			}
		}
		
		// Best way
		String result = new String(removeWhiteSpaceCharArray);
		
		/*
		 * Another way - NOT Optimal
		 * -------------------------
		 * for (char ch : removeWhiteSpaceCharArray) {
		 * 		result = result + ch;
		 * }
		 */
		
		return result;
	}
}
