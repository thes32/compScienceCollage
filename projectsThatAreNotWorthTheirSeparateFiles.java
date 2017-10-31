package main;
import java.util.*;

public class projectsThatAreNotWorthTheirSeparateFiles {
	static int num1, num2, num3;
	static String numbers;
	
	public static void main(String[] args) {
		numbers = "5748975543857983745984379845739874"
					+ "5748397589379485793475983784573899"
					+ "7584937589374895734897598347589578"
					+ "10298310981908329810928398391283902"
					+ "490238903480999890432890848904389"
					+ "0913890815489308596758942498393939"
					+ "75437589738457368172253615781905389";
		num1 = Integer.parseInt(numbers, numbers.charAt(0));
		
		System.out.println(num1);
	}
}