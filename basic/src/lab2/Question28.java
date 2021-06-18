package lab2;

import java.util.Scanner;

/*
 * Write a program that uses an if-else-if ladder to determine which season a particular month is in?
 */
public class Question28 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the full month name to determine the season");
	String month = in.nextLine();
	if(month.equalsIgnoreCase("january") ||month.equalsIgnoreCase("febuary")||month.equalsIgnoreCase("march") ) {
		System.out.println("this is spring season");
	}
	else if(month.equalsIgnoreCase("april") ||month.equalsIgnoreCase("may")||month.equalsIgnoreCase("june")) {
		System.out.println(" this is summer season");
	}
	else if(month.equalsIgnoreCase("july") ||month.equalsIgnoreCase("august")||month.equalsIgnoreCase("september")) {
		System.out.println(" this is autumn season");
	}
	else {
		System.out.println("this is winter season");
	}
	
}
}
