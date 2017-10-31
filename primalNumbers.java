package main;
import java.util.*;

public class primalNumbers {
	static int num, ans, ln, ln2, pF;
	static ArrayList<Integer> numbers;
	static Scanner scan;
	static String nums;
	
	public static void main(String[] args) {
		numbers = new ArrayList<Integer>();
		scan = new Scanner(System.in);
		System.out.println("What number should the program go up to?");
		ans = scan.nextInt();
		
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		
		for (int i = 2; i < ans; i++) {
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
				numbers.add(i);
		}
		System.out.println(numbers);
		ln = numbers.size();
		pF = 1;
		for (int j = 1; j < ln; j++) {
			ln2 = numbers.get(j);
			if (ans % ln2 == 0 && pF < ln2) {
				pF = ln2;
			} else {
				//nothing
			}
		}
		System.out.println("Prime factor of " + ans + " is " + pF);
	}
}
