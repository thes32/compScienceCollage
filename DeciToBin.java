package main;
import java.util.*;

public class DeciToBin {
	static int num, binary, i;
	static Scanner scan;
	static String ar;
	
	public static void main(String[] args) {
		ar = "";
		scan = new Scanner(System.in);
		System.out.println("What number would you like to convert");
		num = scan.nextInt();
		i = 128;
		
		do {
			if (num >= i) {
				ar += "1";
				num = num - i;
				i = i / 2;
			} else {
				ar += "0";
				i = i / 2;
			}
		} while (i >= 1);
		
		System.out.println(ar);
	}
}
