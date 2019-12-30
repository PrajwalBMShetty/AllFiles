package FileOutputExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*try {
		Student s1=new Student(211,"prajwal");
		FileOutputStream fout=new FileOutputStream("d:\\d.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		out.close();
		System.out.println("sucess");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}*/try {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:\\d.txt"));
		Student s=(Student)in.readObject();
		System.out.println(s.id+""+s.name);
		in.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
}
