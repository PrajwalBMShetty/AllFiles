package FileOutputExample;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("D:\\prajwal.txt");
			int i;
			while((i=fr.read())!=-1)
				System.out.println((char)i);
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
