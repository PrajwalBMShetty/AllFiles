package Inheritance;

public class LivingThing {
	public int LifeSpan;
	public String color;
	public LivingThing()
	{
		System.out.println("This is LivingThing Constructor ");
	}
	public LivingThing(int l,String c) {
		LifeSpan=l;
		color=c;
		System.out.println("This is LivingThing Constructor ");
		System.out.println("LIfe span is: "+LifeSpan+""+"Color is :"+color+"");
		
	}
	public void display()
	{
		System.out.println("This is living thing");
	}
	

}
