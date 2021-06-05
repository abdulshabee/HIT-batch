package lab1;

public class Armstrong {
	public static void main(String[] args) {
		int number = 371, orginal,remainder, result=0;
		orginal=number;
		while(orginal!=0) {
			remainder = orginal % 10;
			result += Math.pow(remainder, 3);
			orginal/=10;;
		}
		if(result == number)
			System.out.println(number + " is an Armstrong number.");
			else
			System.out.println(number + " is not an Armstrong number.");
	}

}
