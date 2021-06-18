package lab2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * File Salary.java contains most of a program that takes as input an
employee's salary and a rating of the employee's performance and
computes the raise for the employee.As in the <pre>-lab, an employee who is
rated excellent will receive a 6% raise, one rated good will receive a 4%
raise, and one rated
poor will receive a 1.5% raise.Add the if... else... statements to program
Salary to make it run as described above.
 */

public class Salary {
public static void main(String[] args) {
	double currentSalary;
	double raise ;
	double newSalary;
	String rating;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the current salary :");
	currentSalary = scan.nextDouble();
	System.out.println("Enter the performance rating (Excellent , Good , poor) :");
	rating = scan.next();
	
	if(rating.equalsIgnoreCase("excellent")) {
		raise = currentSalary * 0.06;
	}else if(rating.equalsIgnoreCase("good")) {
		raise = currentSalary * 0.04;
	}
	else if(rating.equalsIgnoreCase("poor") ){
		raise = currentSalary * 0.015;   
	}
	else {
		System.out.println("Rating not found");
		raise = 0;
	}
	
	newSalary = currentSalary + raise;
	NumberFormat money = NumberFormat.getCurrencyInstance(new Locale("en","in"));
	System.out.println();
	System.out.println(" Current Salary : "+money.format(currentSalary));
	System.out.println(" Amount of your raise : "+money.format(raise));
	System.out.println(" Your new Salary : "+money.format(newSalary));
	System.out.println("******** THE END ******");
}
}
