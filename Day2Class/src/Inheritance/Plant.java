package Inheritance;

public class Plant extends LivingThing{
	public String type;
	public Plant() {}
	
	public Plant(int l,String c,String t)
	{
		
		
		super(l,c);
		type=t;
		System.out.println("This is PLANT Constructor");
		System.out.println("LIfe span is: "+LifeSpan+""+"Color is :"+color+" "+"Type is:"+type);
		
	}
	public void display()
	{
		System.out.println("This is living Plant");
	}

}
