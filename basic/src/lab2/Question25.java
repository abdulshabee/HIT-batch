package lab2;

/*
 * Write a program to find out biggest number out of three numbers using relational and short-circuit OR and
AND operators?
 */
public class Question25 {
public static void main(String[] args) {
 	int a = 10;
	int b =  7;
	int c = 5;
	if(a>b && a>c ) {
		System.out.println("A is biggest number ");
	}
	else if(b>c) {
		System.out.println("B is biggest number");
	}
	else {
		System.out.println("C is a biggest number");
	}
}
}
