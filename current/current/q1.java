package current;

import java.util.Scanner;

public class q1 {
	public static void main(String arg[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
//		System.out.println(a);
//		String str=a.toString();
		boolean b=arnstronngnumber(a);

        if (arnstronngnumber(a)) {
            System.out.println(a + " is an Armstrong number.");
        } else {
            System.out.println(a + " is not an Armstrong number.");
        }
	}

	private static boolean arnstronngnumber(int a) {
		// TODO Auto-generated method stub
		int n=0;
		int q=a;
		while(q>0) {
			q=q/10;
			n++;

		}
		int sum=0;
		 q=a;

		while(q!=0) {
			int num=q%10;
			sum+=Math.pow(num, n);
			q=q/10;
			
		}
		return a==sum;
	}

}
