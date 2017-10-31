package main;
import java.util.Scanner;
import java.util.Random;

public class introProgramming {
	
	static Random random;
	static Scanner scan;
	static String answer1, answer2, guess, riddle;
	static int guesses, number;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		random = new Random();
		
		number = random.nextInt(5 - 1 + 1) + 1;
		
		if (number == 1) {
			riddle = "In a plane crash every single person died. Who survived?";
			answer1 = "married people";
			answer2 = "couples";
		} else if (number == 2) {
			riddle = "What had cities, but no houses; forests, but no trees; and water but no fish?";
			answer1 = "maps";
			answer2 = "";
		} else if (number == 3) {
			riddle = "Everybody has me, but nobody can lose me. What am I?";
			answer1 = "shadown";
			answer2 = "";
		} else if (number == 4) {
			riddle = "If you say my name I break. What am I?";
			answer1 = "silence";
			answer2 = "";
		} else if (number == 5) {
			riddle = "What is easy to get into but hard to get out of?";
			answer1 = "troubles";
			answer2 = "";
		}
		
		System.out.println(riddle);
		
		getAnswer();
	}
	
	public static void getAnswer() {
		guesses = 0;
		
		guess = scan.nextLine();
		
		if (guess.equalsIgnoreCase(answer1) || guess.equalsIgnoreCase(answer2)) {
			if (guesses < 3){
				System.out.println("You have got the right answer within 3 guesses. Congrats!");
			} else {
				System.out.println("You took " + guesses + " guesses to get it right. But still well done!");
			}
		} else {
			System.out.println("Wrong, try again.");
			guesses++;
			getAnswer();
		}
	}
}