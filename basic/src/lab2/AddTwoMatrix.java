package lab2;

import java.util.Scanner;

// Write a Java Program to finds addition of two matrices 
public class AddTwoMatrix {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("******* ADDITION OF MATRICES ******");
	System.out.println("Enter the number of rows for both matrices ");
	int rows = sc.nextInt();
	System.out.println("Enter the number of columns for both matrices");
	int columns = sc.nextInt();
	int x[][] = new int [rows][columns];
	int y[][] = new int [rows][columns];
	int z[][] = new int [rows][columns];
	System.out.println("Enter the element for first matrices");
	for(int i = 0; i < rows; i++ ) {
		for(int j = 0; j<columns; j++) {
			x[i][j]=sc.nextInt();
			
		}
		System.out.println();
		}
	System.out.println("Enter the Element for second matrices");
		for(int i = 0; i < rows; i++ ) {
			for(int j = 0; j<columns; j++) {
				y[i][j]=sc.nextInt();
			}
		System.out.println();
	}
		for(int i = 0; i < rows; i++ ) {
			for(int j = 0; j < columns ; j++) {
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		System.out.println("Addition of matrices ");
		for(int i = 0; i < rows; i++ ) {
			for(int j = 0; j < columns ; j++) {
				System.out.print(z[i][j]);
				}
			System.out.println();
			}
	
}
}
