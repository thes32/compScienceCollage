package main;
import java.util.*;

public class romanNums {
	static Scanner scan;
	static int num, rnum;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 50 including");
		num = scan.nextInt();
		if (0 < num && num < 51) {
			conversion();
		} else {
			main(args);
		}
	}
	
	public static void conversion() {
		
	}
}
