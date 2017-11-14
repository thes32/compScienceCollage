package main;
import java.util.*;

public class interviewQuestion {
	static ArrayList<Integer> arr, end;
	
	public static void main(String[] args) {
		arr = new ArrayList<Integer>();
		end = new ArrayList<Integer>();
		arr.add(1);
		arr.add(7);
		arr.add(3);
		arr.add(4);
		int j = arr.size();
		int sum;
		for (int i = 0; i < j; i++) {
			sum = 1;
			for (int k = 0; k < j; k++) {
				if (arr.get(k) == arr.get(i)) {
					//nothing
				} else {
					sum *= arr.get(k);
				}
			}
			end.add(sum);
		}
		
		System.out.println(arr);
		System.out.println(end);
	}
}
