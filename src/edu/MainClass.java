package edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		StringManipulation strman = new StringManipulation();
		
		// 1. String split
		List<String> websites = new ArrayList<String>();
		
		websites.add("http://thisisfortest.com/reviews");
		websites.add("http://www.thisisanotherwebpage.com/this");
		
		strman.splitString(websites);
		System.out.println("----------------");
		
		// 2. String contains
		Scanner in = new Scanner(System.in);
		try {
			String inputString = in.nextLine();
			
			System.out.println("The string input is: "+inputString);
			strman.stringContains(inputString);
		} catch (Exception ex) {
			
		} finally {
			in.close();
		}
		
		// 3. String upper case to lower case
		Scanner sc = new Scanner(System.in);
		try {
			strman.stringUpperToLowerCase(sc.nextLine());
		} catch (Exception ex) {
			
		} finally {
			sc.close();
		}
	}
}
