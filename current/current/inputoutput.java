package current;
import java.io.*;

public class inputoutput {

	public static void main(String[] args) {
		 try{    
			    FileInputStream fin=new FileInputStream("/home/chaitanyakrishna/Downloads/TunnelUpdates (2).xlsx");    
			    BufferedInputStream bin=new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			    bin.close();    
			    fin.close();    
			  }catch(Exception e){System.out.println(e);}    
			 }    

	}
