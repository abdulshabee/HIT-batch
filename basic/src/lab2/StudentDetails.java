package lab2;

/*
 * Create a program that defines a class Student with the data 'name, city,
and age,' as well as a method printData to display the data. To declare and
access the values, create the objects s1 and s2.
 */
public class StudentDetails {
 String name , city;
 int age;
static int m;

public static void main(String[] args) {
	StudentDetails s1 = new StudentDetails();
	StudentDetails s2 = new StudentDetails();
	s1.name ="Nikith";
	s1.age = 21;
	s1.city = "Chennai";
	s2.age = 22;
	s2.name = "meghana";
	s2.city = "mumbai";
	s1.displayData();
	s2.displayData();
	s1.m = 21;
	s2.m = 22;
	StudentDetails.m = 20;
	System.out.println("s1.m = "+s1.m);
	System.out.println("s2.m = "+s2.m);
	System.out.println("Student DEtails.m" +StudentDetails.m);
}
 
 void displayData(){
	 System.out.println("Student Name = "+name);
	 System.out.println("Student City = "+city);
	 System.out.println("Student Age = "+age);
 }
}
class Stest{
	
}
  

