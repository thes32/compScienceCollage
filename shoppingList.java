package main;
import java.util.*;

public class shoppingList {
	static Scanner scan;
	static String yes, no;
	static ArrayList<String> storeList, manualList;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		yes = "The store has ";
		no = "The store does not have ";
		storeList = new ArrayList<String>();
		manualList = new ArrayList<String>();
		storeList.add("milk");
		storeList.add("bread");
		storeList.add("eggs");
		storeList.add("juice");
		storeList.add("flour");
		storeList.add("sugar");
		storeList.add("sweets");
		
		question();
	}
	
	public static void question() {
		System.out.println("What do you want to but from the shop?");
		String answer = scan.next().toLowerCase();
		if (storeList.contains(answer)){
			yes += answer + ", ";
		} else {
			no += answer + ", ";
		}
		System.out.println("Anything else?");
		String ans = scan.next().toLowerCase();
		if (ans.equals("yes")) {
			question();
		} else {
			ending();
		}
	}
	
	public static void ending() {
		System.out.println(yes);
		System.out.println(no);
	}
}
