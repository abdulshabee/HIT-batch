package lab1;

public class LCM {
public static void main(String[] args) {
	int n1,n2,lcm;
	n1=10;
	n2=20;
	lcm=(n1>n2)?n1:n2;
	while(true) {
		if(lcm % n1 ==0 && lcm % n2 ==0) {
			System.out.printf("The Lcm of "+n1+" and "+n2+" is "+lcm);
		break;	
		}
		++lcm;
	}
}
}
