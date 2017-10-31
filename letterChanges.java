package main;
import java.util.*; 
import java.io.*;

public class letterChanges {
	public static String LetterChanges(String str) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		String string = str;
		char[] myNameChars = string.toCharArray();
		char[] alpha = alphabet.toCharArray();
		
		for (int i = 0 ; i<string.length() ; i++) {
	        if (string.charAt(i) == 'o') {
		        int yes = i;
	        }
		}
		
		string = String.valueOf(myNameChars);
		
		str = string;
		return str;
	}
	
	
	public static void main (String[] args) {
		// keep this function call here     
		System.out.println("YES");
	    Scanner s = new Scanner(System.in);
	    System.out.print(LetterChanges(s.nextLine())); 
	    
	}
}
