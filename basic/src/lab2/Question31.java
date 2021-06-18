package lab2;

import java.util.Scanner;

//Write a program for four-function calculator using switch case?(add,sub,mul,div)
public class Question31 {
public static void main(String[] args) {
	double num1, num2, result;
	String opt;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the first number");
	num1 = in.nextInt();
	System.out.println("Enter the second number");
	num2 = in.nextInt();
	System.out.println("Select a operator(+,-,*,/)");
	opt=in.next();
	switch(opt) {
	case "+": result = num1 + num2 ;
				System.out.println(num1 +"+"+ num2 +"="+result);break;
	case "-": result = num1 - num2 ;
	System.out.println(num1 +"-"+ num2 +"="+result);break;
	case "*": result = num1 * num2 ;
	System.out.println(num1 +"*"+ num2 +"="+result);break;
	case "/": result = num1 / num2 ;
	System.out.println(num1 +"/"+ num2 +"="+result);break;
	default: System.out.println("invalid operator");
	}
}
}
