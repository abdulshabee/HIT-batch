package lab1;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int first = 120, second = 220;
		int temporary;
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		temporary=first;
		first=second;
		second=temporary;
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		}
	
}
