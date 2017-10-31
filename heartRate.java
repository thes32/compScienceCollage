package main;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class heartRate {
	static FileWriter fileWriter;
	
	public static void main (String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("what is thy age?");
		int age = scan.nextInt();
		System.out.println("what is your resting heart rate");
		int nBPM = scan.nextInt();
		int mBPM = 220 - age;
		int tBPM;
		
		File files = new File("HR.csv");
        fileWriter = new FileWriter(files, true);
        BufferedWriter buffers =  new BufferedWriter(fileWriter);
        PrintWriter pw = new PrintWriter(buffers);
        
		
		for (int i = 50; i < 101; i = i + 5) {
			tBPM = ((mBPM - nBPM) * i / 100) + nBPM;
			
	        pw.println("Intensity , " + i + " , " + "Heart rate , " + tBPM);
	        
		}
		
		pw.close();
		
		System.out.println("Export Done");
	}
}
