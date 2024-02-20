package current;

import java.util.Arrays;

public class prefectnumber {
	public static void main(String []arg) {
//		int a = 122;
//		String b=Integer.toString(a);
//		String c="";
//		for(int i=b.length()-1;i>=0;i--) {
//			c+=b.charAt(i);	
//		}
//
//		if(b.equals(c)) {
//			System.out.println("pladrom");
//		}else {
//			System.out.println("notpladrom");
//
//		}	
//		
//		int a=7;
//		int b=1;
//		for(int i=1;i<=a;i++) {
//			b*=i;
//		}
//		System.out.println("the factorial of 7 is "+b);
//
//		int a[]= {187654,11,21,12,65,1234,7,9};
//		int b=a[0];
//		int c=a.length;
//		Arrays.sort(a);	
//		for(int i :a) {
//			System.out.println(i);
//		}
//		for(int i=0;i<c-1;i++) {
//			if(a[i]>b) {
//				b=a[i];
//			}
//			
//		}
//		System.out.println(b);
//		for(int i=0;i<c-1;i++) {
//			for(int j=0;j<c-i-1;j++) {
//				if(a[j]>a[j+1]) {
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
//		  System.out.println("Sorted array in ascending order: ");
//			for(int q :a) {
//				System.out.println(q);
//			}
		
//		int a=12341;
//		String b=Integer.toString(a);
//		int c=1;
//		for(int i=0;i<b.length()-1;i++) {
//			c=0;
//			if(b.charAt(i)=='1') {
//				c++;
//			}
//
//		}
		int a=122;
		int b=a;
		int result=0;
		while(b>0) {
			int c=b%10;
			result=(result*10)+c;
			b=b/10;			
		}
		System.out.println(result);

	}

}