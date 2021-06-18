package lab2;
/*
 * Using parameterized constructor with two parameters id and name. While
creating the objects obj1 and obj2 passed two arguments so that this
constructor gets invoked after creation of obj1 and obj2.
 */

public class Employee {
	int id;
	String name;
public Employee(int id, String name) {
	this.id=id;
	this.name= name;
}
void DisplayData() {
	System.out.println("Employee ID = "+id);
	System.out.println("Employee Name = "+name);
}
public static void main(String[] args) {
	Employee obj1 = new Employee(1234,"Nikith");
	Employee obj2 = new Employee(45678,"meghana");
	obj1.DisplayData();
	obj2.DisplayData();
	
	
}
}
