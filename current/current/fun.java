package current;

public class fun {
	public static void main(String[] args) {
//		int a=123;
//		int b=a;
//		int d=0;
//		while(b>0){
//			int c=b%10;
//			d=(d*10)+c;
//			b=b/10;
//			
//		}
//		System.out.println(d);
		String b="hello world";
		String a="qwertyuipasdfghjlzxcvbnm";
		int count=0;
		for(int i=0;i<a.length();i++) {
			count=0;
			for(int j=0;j<b.length();j++) {
				if (a.charAt(i)==b.charAt(j)) {
					count++;
				}
			}
			if(count>0) {
			System.out.println(a.charAt(i)+";"+count);
			}
		}
		
	}
}
