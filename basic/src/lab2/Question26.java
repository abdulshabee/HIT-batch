package lab2;

import java.util.Scanner;

/*
 * Write a program to swap of two integers without using temporary variable
 */

public class Question26 {
public static void main(String[] args) {
	int first;
	int sec;
	int temp;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the first number :");
	first = in.nextInt();
	System.out.println("Enter the Second number:");
	sec = in.nextInt();
	System.out.println(" the first number is "+first);
	System.out.println(" the second number is "+sec);
	
	temp= first;
	first = sec;
	sec = temp;
	System.out.println("**** After Swap ****");
	System.out.println(" the first number is "+first);
	System.out.println(" the second number is "+sec);
	
}

}
