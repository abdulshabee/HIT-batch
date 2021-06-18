package lab2;

import java.util.Scanner;

// Write a program that uses a switch case to determine given character is vowel or not?
public class Question29 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String c;
 System.out.println("Enter the character to find it vowel or not?");
 c = in.next();
 switch(c) {
 case "a": System.out.println( "a is an vowel ");break;
 case "e": System.out.println( "e is an vowel ");break;
 case "i": System.out.println( "i is an vowel ");break;
 case "o": System.out.println( "o is an vowel ");break;
 case "u": System.out.println( "u is an vowel ");break;
 default :	System.out.println("is not a vowel ");
 }
}
}
