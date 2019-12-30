package Inheritance2;

public class Automobile {
	public String model;
		
		public String engine;
		public String color;
		public Automobile()
		{
			System.out.println("This is automobile class");
		}
		public Automobile(String m,String e,String c)
		
		{
			model=m;
			engine=e;
			color=c;
			System.out.println("This is automobile constructor");
			System.out.println("Model is"+model+""+"Engine is :"+engine+""+"color is:"+color);
			
		}
		public void display()
		{
			System.out.println("This is Automobile class");
		}
}
