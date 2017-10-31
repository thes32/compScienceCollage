package main;
import java.util.*;

public class DeciToHex {
	static int deci, i, fn = 0, sn = 0;
	static String hex;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("Enter a random NUMBER!");
		deci = scan.nextInt();
		i = 1;
		
		if (deci % 16 == 0) {
			while (deci - 16 != 0) {
				deci = deci - 16;
				i++;
			}
			i = i * 10;
			
			System.out.println(i);
		}
		else {
			complicated();
		}
	}
	
	public static void complicated() {
		if (deci > 16) {
			fn++;
			deci = deci - 16;
			complicated();
		} else {
			for (int j = 1; j < 16; j++) {
				if (deci == j){
					sn = j;
				}
				if (sn == 10) {
					hex = "A";
				} else if (sn == 11) {
					hex = "B";
				} else if (sn == 12) {
					hex = "C";
				} else if (sn == 13) {
					hex = "D";
				} else if (sn == 14) {
					hex = "E";
				} else if (sn == 15) {
					hex = "F";
				} else {
					hex = Integer.toString(sn);
				}
			}
		}
		
		System.out.println(fn + "" + hex);
	}
}