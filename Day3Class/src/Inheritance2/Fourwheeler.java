package Inheritance2;

public class Fourwheeler extends Automobile {
	public int No_of_Wheels;
	public Fourwheeler()
	{
		System.out.println("This is Fourwheeler class");

	}
	public Fourwheeler(String m,String e,String c,int n)
	{
		super(m,e,c);
		No_of_Wheels=n;
		System.out.println("This is Fourwheeler constructor");
		System.out.println("Model is"+model+""+"Engine is :"+engine+""+"color is:"+color+""+"No of wheels is"+No_of_Wheels+n);
		
	}

}
