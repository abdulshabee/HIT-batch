package lab1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num  = in.nextInt();
		
		int factorial = fact(num);
		System.out.println("Factorial of entered number is: "+factorial);
		in.close();
	}
	static int fact(int n) {
		int output;
		if(n==1) {
			return 1;
		}
		output = fact(n-1)*n;
		return output;
	}

}
