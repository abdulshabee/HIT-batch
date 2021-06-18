package lab2;
// Write a program in JAVA to create a class Bird also declares the different
// parameterized constructor to display the name of Birds.

public class Birds {
	int age;
	String name;
public Birds() {
	System.out.println("this is the parrot");
}
Birds(String x){
	this.name = x;
	System.out.println("this is "+name);
}
Birds(String x, int y){
	this.name = x;
	this.age = y;
	System.out.println("this is "+name+" age is "+age);
}
public static void main(String[] args) {
	Birds a = new Birds();
	Birds b = new Birds("sparrow");
	Birds c = new Birds("maina",4);
}
}
