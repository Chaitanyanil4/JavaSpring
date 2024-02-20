package online;

public class Q3 {
//	3. Write a Java program to check if a vowel is present in a string.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aeiou";
		String b="anil";
		int count=0;
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<b.length();j++) {
				if(a.charAt(i)==b.charAt(j)) {
					count++;
				}
			}
			
		}
		System.out.println(count);

	}

}
