package lab2;
//Write a program to demonstrate several assignment operators (+=, -=, *=, /=)?

public class Question17 {
public static void main(String[] args) {
	int val = 5;
	int asign;
	asign = 2;
	System.out.println("the value is "+val);
	
	asign += val;
	System.out.println("the value using 2 += "+asign);
	
	asign -= val;
	System.out.println("the value using  2 -= "+asign);
	
	asign *= val;
	System.out.println("the value using 2 *= "+asign);
	
	asign /= val;
	System.out.println("the value using 2 /="+asign);
}
}
