package FileOutputExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 //FileOutputStream fout=new FileOutputStream("D:\\prajwal.txt");
    	 FileInputStream fin=new FileInputStream("D:\\prajwal.txt");
    	// String s="Welcome to slk";
    	// byte b[]=s.getBytes();
    	 //fout.write(b);
    	// fout.close();
    	// System.out.println("success...");
    			 int i=0;
    	 while((i=fin.read())!=-1)
    	 {
    		 System.out.println((char)i);
    	 }
    	 fin.close();
    	 }
     catch(Exception e) {
    	 System.out.println(e);
     }
	}
}
