package lab1;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
		int temp, num;
		boolean isprime = true;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number:");
		num = in.nextInt();
		in.close();
		for (int i=2;i<=num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isprime = false;
				break;
			}
		}
		if(isprime)
			System.out.println(num + " is a Prime Number");
			else
			System.out.println(num + " is not a Prime Number");
	}
}
