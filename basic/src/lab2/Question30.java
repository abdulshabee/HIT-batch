package lab2;

import java.util.Scanner;
// Write a program that uses a switch case to determine which season a particular month is in?
public class Question30 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the full month name to determine the season");
		String month = in.nextLine();
		
		switch(month) {
		case "january" : System.out.println("this spring season");break;
		case "febuary": System.out.println("this spring season");break;
		case "march": System.out.println("this spring season");break;
		case "april": System.out.println("this summer season");break;
		case "may": System.out.println("this summer season");break;
		case "june": System.out.println("this summer season");break;
		case "july": System.out.println("this autumn season");break;
		case "august": System.out.println("this autumn season");break;
		case "september": System.out.println("this autumn season");break;
		case "octocber": System.out.println("this winter season");break;
		case "november": System.out.println("this winter season");break;
		case "december": System.out.println("this winter season");break;
		default : System.out.println("Enter the valid month");
		}
	}

}
