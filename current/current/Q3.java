
package current;

import java.util.*;

public class Q3 {
	public static void main(String [] arg) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		
		String b=Integer.toString(a);
		int d=b.length();
		int result=0;
		for(int i=0;i<d;i++) {
		    int s= Character.getNumericValue(b.charAt(i));
		    result+=Math.pow(s, d);

		}
		System.out.println(result);
		 if (result == a) {
	            System.out.println(a + " is an Armstrong number.");
	        } else {
	            System.out.println(a + " is not an Armstrong number.");
	        }

	}

}
