package main;
import java.util.*;

public class loops {
	static int ans, i, num;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		ans = scan.nextInt();
		num = ans;
		
		for (i = 1; i <= ans; i++) {
			num *= i;
		}
		
		System.out.println("Factorial of " + ans + " is: " + num);
	}
}