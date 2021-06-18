package lab2;

import java.util.Scanner;

/*
 * The file Grades.java contains a program that reads in a sequence of student
grades and computes the average grade, thenumber of students who pass (a
grade of at least 60) and the number who fail. Compile and run the
program to see how it works.
 */

public class Grades {
public static void main(String[] args) {
	double grade, sumOfGrades;
	int numStudent, numPass, numFail;
	Scanner scan = new Scanner(System.in);
	System.out.println("Grading Processing Program");
	grade = 0;
	sumOfGrades = 0;
	numStudent = 0;
	numPass = 0;
	numFail = 0;
	System.out.println("Enter the First grade");
	grade = scan.nextDouble();
	while(grade >= 0) {
		sumOfGrades = sumOfGrades + grade;
		numStudent = numStudent + 1;
		if(grade < 60) {
			numFail = numFail + 1;
		}
		else {
			numPass = numPass + 1;
		}
		System.out.println("Enter the next grade (a negative to quit):");
		grade =scan.nextDouble();
	}
	if (numStudent > 0)
	{
	System.out.println ("\nGrade Summary: ");
	System.out.println ("Class Average: " +sumOfGrades/numStudent);
	System.out.println ("Number of Passing Grades: " + numPass);
	System.out.println ("Number of Failing Grades: " + numFail);
	}
	else
	System.out.println ("No grades processed.");
	
}
}
