package lab2;
/*
 * Write a java Program to generate a Ladder of number
 */

import java.util.Scanner;

public class Ladder {
	public static void main(String arr[]) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the number of  rows");
	int r =in.nextInt();
	in.close();
	for(int i=1;i<=r;i++) {
		 for(int j =1;j<=i; j++) {
			 System.out.print(j);
		 }
		 for(int k = i-1; k>=1; k--) {
			 System.out.print(k);
		 }
		 System.out.println();
	}
	
	}
}
