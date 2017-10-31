package main;
import java.util.*;

public class recursion {
	
	public static void main (String[] args) {
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for (int i = 1; i < 1001; i++) {
			if (i % 3 == 0) {
				arl.add(i);
			} else if (i % 5 == 0) {
				arl.add(i);
			} else {
				//nothing
			}
		}
		
		System.out.println(arl);
		
		int total = 0, num1, num2;
		for (int i = 0; i < arl.size(); i = i + 2) {
			for (int j = 1; i < arl.size(); i = i + 2) {
				num1 = arl.get(i);
				num2 = arl.get(j);
				total = total + num1 + num2;
			}
		}
		
		System.out.println(total);
	}
}
