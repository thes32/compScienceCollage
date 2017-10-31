package main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class CAtext {
	static Scanner scan = new Scanner(System.in);
    static String dType, answer,  problem, make, model, solution, OS;
    static int old, memory;
    static String keywords; 
    static boolean  wet, dropped, charged, fullycharged;
    static FileWriter fileWriter;
    
    public static void main(String[] args) throws IOException {
        keywords = "";
        questions();
    }
    
    public static void questions() throws IOException {
        // The lines below this are mainly questions about the device itself, to which the user would answer in 1 or 2 words..
    	
        System.out.println("What type of device is it?");
        dType = scan.next();
        dType = dType.toLowerCase();
        
        System.out.println("What make is it?");
        make = scan.next();
        make = make.toLowerCase();
        		
        System.out.println("What memory does it have? 8GB, 16GB, 32GB, 64GB, 128GB");
        memory = scan.nextInt();
        
        System.out.println("What model is it?");
        model = scan.next() + scan.nextLine();
        model = model.toLowerCase();	
        
        // These questions are simple questions, to define if the solution to the problem is simple or not.
        System.out.println("Is the " + dType + "'s screen smashed?");
        answer = scan.next();
        
        // The variable changes depending to the answer.
        if (answer.equalsIgnoreCase("Yes")){
            dropped = true;
        } else {
            dropped = false;
        }
        
        System.out.println("Did the " + dType + " get wet?");
        answer = scan.next();
        
        if (answer.equalsIgnoreCase("Yes")){
            wet = true;
        } else {
            wet = false;
        }
        
        System.out.println("Is the " + dType + " charged?");
        answer = scan.next();	
        
        if (answer.equalsIgnoreCase("Yes")){
            charged = true;
        	System.out.println("Fully?");
        	answer = scan.next();
        	if (answer.equalsIgnoreCase("Yes")){
                fullycharged = true;
            } else {
                fullycharged = false;
            }
        } else {
            charged = false;
        }
        
        System.out.println("How old is the " + dType + "? (months)");
        old = scan.nextInt();
        
        // The user's answers so far are printed, to see if the system recognized them correctly or not.
        // If yes, the program continues as normal
        // If no, the user is taken to the top, and asked these questions again.
        System.out.println("Device type:    " + dType);
        System.out.println("Device make:    " + make);
        System.out.println("Device model:   " + model);
        System.out.println("Device memory:  " + memory + "GB");
        System.out.println("Device wet:     " + wet);
        System.out.println("Device smashed: " + dropped);
        System.out.println("Device charged: " + charged);
        System.out.println("Device age:     " + old + " months");
        
        System.out.println("Is it correct? **");
        answer = scan.next();
        
        if (answer.equalsIgnoreCase("yes")){
            simple();
        } else {
            questions();
        }
    }
    
    public static void simple() throws IOException {
    	// This part of the program checks if the solutions are simple. If they are, it prints some advice, than it closes. 
    	// If it's not, it goes as normal to the next part of the program
    	if (dropped == true || wet == true || charged == false){
    		if (dropped == true) {
        		System.out.println("Unfortunetly I can't help you with a smashed screen, but I can advise you to go to a repair shop to get the screen fixed");
        	} 
        	if (wet == true){
        		System.out.println("If the water has been expsed to water for a few seconds, you might want to get a new one, or to go to a repair shop.");
        	} 
        	if (charged == false){
        		System.out.println("Try charging the phone first, and then if there are still issues come back");
        	}
    	} else {
    		analyse();
    	}
    }
    public static void analyse() throws IOException {
        // In this part of the code the program ask the user to input what their problem is.
    	// The program then detects specific keywords in the user's problem, and adds them to a String.
    	
        System.out.println("What is wrong with the " + dType + "?");
        problem = scan.next() + scan.nextLine();
        problem = problem.toLowerCase();
        
        if(problem.contains("display") || problem.contains("screen")){
        	
            if(problem.contains("not working") || problem.contains("blank") || problem.contains("broken")){
            	keywords += "display_not_working; ";
            } else if (problem.contains("wrong color") || problem.contains("wrong colour")) {
                keywords += "display_wrong_color; ";
            } else {
            	//no nothing
            }
        }
        if (problem.contains("cable")){
            keywords += "cable; ";
        }
        if (problem.contains("not charging") || problem.contains("doesn't charge") || problem.contains("doesnt charge")){
            keywords += "not_charging; ";
        }
        if (problem.contains("touchscreen")){
            
            if (problem.contains("not working")){
                keywords += "touchscreen_not_working; ";
            } else {
                //do nothing
            }
            
        }
        if (problem.contains("applications")){
            
            if (problem.contains("not working") || problem.contains("freeze")){
                keywords += "apps_not_working; ";
            } else {
                //do nothing
            }
            
        }
        if(problem.contains("jack") || problem.contains ("headphones")){
            
            if(problem.contains("broken") || problem.contains("not working")){
            	keywords += "jack_broken; ";
            } else {
            	//do nothing
            }
            
        }
        if(problem.contains("no signal")){
            keywords += "no_signal; ";
        }
        if(problem.contains("low life") || problem.contains("fast drain")){
            keywords += "low_life; ";
        }
        
        // The program asks if the keywords detected are correct, so it can continue. If not, the user is asked to input the problem again.
        System.out.println("KeyWords:");
        System.out.println(keywords);
        
        System.out.println("Is it correct? **");
        answer = scan.next();
        if (answer.equalsIgnoreCase("yes")){
            end();
        } else {
            analyse();
        }
    }
    
    public static void end() throws IOException{
    	// In this part the program checks for the keywords detected in the previous part and gives a solution.
    	
        solution = "";
        if (keywords.contains("display_not_working")) {
            solution += "Hold the power button for a few seconds, if it does not work see a repair shop. ";
        }
        if (keywords.contains("display_wrong_color")) {
            solution += "Restart your phone. If the problem persists, go to a repair shop. ";
        }
        if (keywords.contains("cable") && keywords.contains("not_charging")) {
            solution += "Change charger or see a repair shop. ";
        }
        if (keywords.contains("touchscreen_not_working")) {
            solution += "Restart your phone, or go to a repair shop. ";
        }
        if (keywords.contains("apps_not_working")) {
            solution += "Restart your phone. If the problem persists, try to factory reset it or see a repair shop. ";
        }
        if (keywords.contains("jack_broken")) {
            solution += "Change headphones or go to a repair shop. ";
        }
        if (keywords.contains("low_life")) {
            solution += "Replace your battery if you can, or see a store/repair shop";
        }
        if (keywords.contains("no_signal")){
            solution += "Restart your phone, make sure there's a SIM in it. If the problem persists, "
            		+ "try moving around your location or try leaving that location for higher ground or somewhere closer to a city. ";
        }
        
        System.out.println(solution);
        
        // The program creates a file and takes a random number from 1 to 90000. Then it prints the number along with all the user's input to a file.
        
        File files = new File("tech.csv");
        fileWriter = new FileWriter(files, true);
        BufferedWriter buffers =  new BufferedWriter(fileWriter);
        PrintWriter pw = new PrintWriter(buffers);
        Random rand = new Random();
        int random = rand.nextInt((90000 - 1 ) + 1) + 1;
        
        pw.println(random + "," + dType + "," + make + "," + model + "," + wet + "," + dropped + "," + charged + "," + old + "," + keywords);
        
        pw.close();
        
        readfile();
    }
    
    public static void readfile(){
    	// This part is responsible for reading a file from the computer and print all the lines in the file. 
    	// But first it has to check which make the device is, so it can know what OS is has.
    	// If it is now one of these makes, the program will exit and not give basic tips.
    	
        if (make.equals("apple"))
            iphone();
        else if (make.equals("samsung") || make.equals("sony") || make.equals("motorola") || make.equals("lg") || make.equals("htc") || make.equals("nokia"))
            android();
        else if (make.equals("windows"))
        	windows();
        else {
        	System.out.println("Is your " + dType + " running android, iOS or Windows?");
        	OS = scan.next().toLowerCase();
        	
        	if (OS.equals("android"))
        		android();
        	else if (OS.equals("ios"))
        		iphone();
        	else if (OS.equals("windows"))
        		windows();
        	else
        		System.out.println("Sorry I can;t recognise that operating system, have a Good Day!");
        }
    }
    
    public static void android() {
    	// If the device is running Android, the program reads the android tips file and prints all it reads.
    	
        String csvFile = "android.txt";
        String line = "";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) { 
                
                System.out.println(line);

            }
        } catch (IOException e){
        }
    }
    
    public static void iphone() {
    	// If the device is running iOS, the program reads the iOS tips file and prints it.
    	
        String csvFile = "iphone.txt";
        String line = "";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                
                System.out.println(line);

            }
        } catch (IOException e){
        }	
    }
    
    public static void windows() {
    	// If the device runs Windows, the program reads the Windows file and prints it to give the user tips
    	
    	String csvFile = "windows.txt";
    	String line = "";
    	
    	try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
    		while ((line = br.readLine()) != null) {
    			
    			System.out.println(line);
    			
    		}
    	} catch (IOException e) {
    	}
    }
}