package main;
import java.util.*;

public class nestedSelection {
	
	public static void main(String[] args) {
		boolean rain, pollen;
		boolean HF;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you have hay fever?");
		String ans = scan.next();
		if (ans.equals("yes"))
			HF = true;
		else 
			HF = false;
		
		System.out.println("Is there a high pollen count outside?");
		ans = scan.next();
		if (ans.equals("yes"))
			pollen = true;
		else 
			pollen = false;
		
		
		System.out.println("Is it raining today?");
		ans = scan.next();
		if (ans.equals("yes"))
			rain = true;
		else 
			rain = false;
		
		if(rain && !pollen && !HF) {
			System.out.println("Take an umbrella");
		} else if(pollen && !HF) {
		 	System.out.println("You got nothing to worry about");
		} else if(pollen && HF && !rain) {
			System.out.println("Take the tablets");
		} else if(rain && pollen && !HF) {
			System.out.println("Take only an umbrella, since the rain cancels the pollen's effects");
		} else if(rain && pollen && HF) {
			System.out.println("Take the tablets and take the umbrella.");
		}
	}
}