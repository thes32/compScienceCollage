package main;
import java.util.*;

public class callumTTTM {
	static Scanner scan;
	static ArrayList ar;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		ar = new ArrayList();
		
//		for (int i = 1; i < 1001; i++) {
//			if (i % 3 == 0 || i % 5 == 0) {
//				ar.add(i);
//			}
//		}
		
		System.out.println(ar);
		
		recFactorial(10);
	}
	
	public static int recFactorial (int n) {
		if (n == 1)
			return 1;
		else {
			return n * recFactorial(n-1);
		}
	}
}
