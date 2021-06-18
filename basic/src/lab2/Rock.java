package lab2;

import java.util.Random;
import java.util.Scanner;

/*
 * Program Rock.java contains a skeleton for the game Rock, Paper, Scissors.
Open it and save it to your directory. Add statements to the program as
indicated by the comments so that the program asks the user to enter a
play, generates a randomplay for the computer, compares them and
announces the winner (and why).
 */

public class Rock {
public static void main(String[] args) {
	String personPlay;
	
	int computerInt;
	Scanner scan = new Scanner(System.in);
	Random genetator = new Random();
	System.out.println("Lets play rock, paper, scissors");
	System.out.println("select   R for rock \n\t P for paper \n\t S for scissors ");
	personPlay = scan.nextLine();
	computerInt = genetator.nextInt(3);
	String computerPlay;
	switch(computerInt) {
	case 0 : computerPlay ="S";
	System.out.println("computer Selected Scissors!!");
	break;
	
	case 1 : computerPlay ="P";
	System.out.println("computer Selected Paper!!");
	break;
	
	case 2 : computerPlay ="R";
	System.out.println("computer Selected Rock!!");
	break;
	
	default : computerPlay = null;
	break;
	}
	System.out.println(computerPlay);
	if(personPlay.equals(computerPlay)) {
		System.out.println("its a Tie");
	}
	else if(personPlay.equals("R")) {
		
	if(computerPlay.equals("S")) {
			System.out.println("Rock crushes scissors...you win!!");
	}
	else{
		System.out.println("paper covers the Rock....you lost");
	}
	}
	else if(personPlay.equals("S")) {
		
		if(computerPlay.equals("R")) {
				System.out.println("Rock crushes scissors...you Lost!!");
		}
		else{
			System.out.println("Scissor cut the paper....you Win!!");
		}}
		else if(personPlay.equals("p")) {
			
			if(computerPlay.equals("S")) {
					System.out.println("Scissor cut the paper...you lost!!");
			}
			else{
				System.out.println("paper covers the Rock....you win");
			}}
	
	
}
	
}	
	

