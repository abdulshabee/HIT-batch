package lab2;

// Write a Java program to find area and perimeter of a square and rectangle?
public class Question24 {
public static void main(String[] args) {
	int length = 4;
	int breadth = 10;
	int side = 4;
	int periRect = 2*(length + breadth);
	System.out.println("Area of the square = "+(side*side));
	System.out.println("perimeter of the square = "+(side+side));
	System.out.println("Area of the rectangle = "+(length * breadth));
	System.out.println("perimeter of the rectangle ="+periRect);
	
}
}
