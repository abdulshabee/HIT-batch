package lab1;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		System.out.println("Enter side of square : ");
		Scanner in = new Scanner(System.in);
		in.close();
		double side = in.nextDouble();
		double area = side*side ;
		System.out.println("Area of square is : "+area);
	}
}
