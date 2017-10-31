package main;
import java.util.*;

public class clock {
	static Scanner scan;
	static int angleM, angleH, min, hours, totalAM, totalAH, diff, diff2;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		angleM = 6;
		angleH = 30;
		System.out.println("Where is the minutes hand?");
		min = scan.nextInt();
		System.out.println("Where is the hours hand?");
		hours = scan.nextInt();
		
		totalAM = angleM * min;
		totalAH = angleH * hours;
		
		if (totalAH < totalAM) {
			diff = totalAM - totalAH;
			diff2 = 360 - diff;
		} else if (totalAM < totalAH) {
			diff = totalAH - totalAM;
			diff2 = 360 - diff;
		} else {
			diff = 0;
			diff2 = 360;
		}
		
		System.out.println("The angle between the hands is " + diff);
		System.out.println("The exterior angle is " + diff2);
	}
}