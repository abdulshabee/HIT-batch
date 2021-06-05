package lab1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
	int year ;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the any year");
	year = in.nextInt();
	in.close();
	if(year%4==0) {
		System.out.println(year+" is a leap year");
	}
	else {
		System.out.println(year+" is not a leap year");
	}
	}
}
