package online;

public class Q4 {

// prime number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
//		Boolean b=isprime(a);
		System.out.println(isprime(a));
	}

private static Boolean isprime(int a) {
	System.out.println(a);

	if (a%2==0) {
		return true;
	}
	else {
		return false;
	}
}
}
