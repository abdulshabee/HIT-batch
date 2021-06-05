package lab1;


public class Power {

public static void main(String[] args) {
	int num=2, exponent=4;
	long result=1;
	while(exponent!=0) {
		result=result * num;
		--exponent; 
		} 
	System.out.println("The Value is "+result); 
}
} 