package Inheritance2;

public class Car extends Fourwheeler {
	public int year;
	public  Car ()
	{
		System.out.println("This is Car class");
	}
	public Car(String m,String e,String c,int n,int y)
	{
		super(m,e,c,n);
		year=y;
		System.out.println("This is Car constructor");
		System.out.println("No of wheels:"+No_of_Wheels+""+"Engine is :"+engine+""+"color is:"+color+""+"Model is:"+model+""+"Year of manufacture is "+year);
		
	}

}
