package current;

public class occurenceofadigit {
	public static void main(String arg[]) {
		int a=34567;
		int b=a;
		int num=6;
		int c=0;
		while(b>0) {
			int rem=b%10;
			if(rem==num) {
				c++;
			}
			b=b/10;
		}
		System.out.println("the number occeranc is"+num+"is"+c);
	}
}
