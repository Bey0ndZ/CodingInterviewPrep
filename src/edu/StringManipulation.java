package edu;

import java.util.Arrays;
import java.util.List;

public class StringManipulation {
	public void splitString(List<String> stringList) {
		for (String str : stringList) {
			System.out.println("Current string is: "+str);
			String[] strArray = str.split("//");
			System.out.println("Splitting at //: "+Arrays.toString(strArray));
			System.out.println("Re-splitting at /: "+Arrays.toString(strArray[1].split("/")));
		}
	}
	
	public void stringContains(String str) {
		if (str.contains("Sumanth")) {
			System.out.println("The given string contains the word Sumanth");
		} else {
			System.out.println("The given string does not contain the word Sumanth");
		}
	}
	
	public void stringUpperToLowerCase(String str) {
		System.out.println("Upper case to lower case: "+str.toLowerCase());
	}
}
