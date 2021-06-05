package lab1;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		System.out.println("Enter radius of circle : ");
		Scanner in = new Scanner(System.in);
		double radius = in.nextDouble();
		in.close();
		double area = Math.PI * (radius * radius) ;
		System.out.println("Area of square is : "+area);
	}
}
