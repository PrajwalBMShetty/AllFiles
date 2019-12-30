package FileOutputExample;

import java.io.FileWriter;

public class FikeWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter("D:\\ prajju.txt");
			fw.write("Welcome to India");
			fw.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Success");

	}

}
