package current;

public class martris {
	public static void main(String arg[]) {
		int a[][]= {{123,143,543},{234,221,222},{123,43,23}};
		int b[][]= {{432,567,987},{234,2334,98}};
		int row=a.length;
		int col=b[0].length;
		int c[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				for(int k=i;k>=i;k++) {
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			
		}
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
