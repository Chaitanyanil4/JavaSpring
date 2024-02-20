package online;
//How do you reverse a string in Java?
public class reverseastring {

	public static void main(String[] args) {
		String a="anil";
		String b="";
		for(int i=a.length()-1;i>=0;i-- ) {
			b+=a.charAt(i);
		}
		System.out.println(b);
	}

}
