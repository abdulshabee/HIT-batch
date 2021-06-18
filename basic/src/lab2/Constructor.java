package lab2;
/*
 * Write a program in JAVA to demonstrate the method and constructor
overloading
 */

public class Constructor {
public Constructor() {
	System.out.println("Constructor is called");
}
int p,q;
public Constructor(int x,int y) {
this.p = x;
this.q = y;
}
void display() {
	System.out.println("p ="+p);
	System.out.println("q ="+q);
}
public static void main(String[] args) {
	int x=2, y=3, z=4;
	Constructor c = new Constructor();
	Constructor cc = new Constructor(x ,z);
	c.display();
	cc.display();
	float m=7.2F, n=5.2F;
	int k=c.add(x,y);
	int t=c.add(x,y,z);
	float ft = c.add(m, n);
	System.out.println("k = "+k);
	System.out.println("t = "+t);
	System.out.println("ft ="+ft);
}
public int add(int i , int j) {
	return(i+j);
}
public int add(int i , int j , int k) {
	return(i+j+k);
}
public float add(float f1 , float f2) {
	return(f1+f2);
}
}

