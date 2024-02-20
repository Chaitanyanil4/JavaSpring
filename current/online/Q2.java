package online;

public class Q2 {
//	2. How do you swap two numbers without using a third variable in Java?
	public static void main(String[] args) {
		int a=10;
		int b=8;
		int c=a+b;
		 a=c-a;
		b=c-b;
		System.out.println(a+","+b);
		
	}

}
