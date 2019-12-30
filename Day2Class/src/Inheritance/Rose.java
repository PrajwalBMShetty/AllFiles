package Inheritance;

public class Rose extends Plant {
	String Fragrance;
	public Rose() {}
	public Rose(int l,String c,String t,String f)
	{
		super(l,c,t);
		Fragrance=f;
		System.out.println("This is Rose Constructor");
		System.out.println("LIfe span is: "+LifeSpan+""+"Color is :"+color+" "+"Type is:"+type+""+"Fragrance is:"+Fragrance);
		
	}
	public void display()
	{
		System.out.println("This is Rose");
	}

}
