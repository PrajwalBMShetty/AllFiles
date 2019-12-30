package AllMethods;

import java.util.Scanner;

public class Calculation {
	
	/*public float SimpleInterest(float p,float )
	{
		float p,t,r;
		float SI;
		System.out.println("Enter the Principal,Time and Rate");
		Scanner sc=new Scanner(System.in);
		p=sc.nextFloat();
		t=sc.nextFloat();
		r=sc.nextFloat();
		SI=(p*t*r)/100;
		
		System.out.println("Simple interest is"+SI);
		return SI;
	}
	public double Area()
	{
		double r;
		double a;
		System.out.println("Enter the value of radius");
		Scanner scn=new Scanner(System.in);
		r=scn.nextDouble();
		a=3.1*r*r;
		System.out.println("Area IS :"+a);
		return a;
		
	}
	public String GREETING()
	{
		return "Welcome to SLK";
	}*/
	public int add(int a,int b)
	{
		int sum;
		sum=(a+b);
		System.out.println("Sum of two numbers is:"+sum);
		return sum;
	}
	public String AddString(String hello,String Uppu)
	{
		String S;
		S=hello+Uppu;
		System.out.println("added String is"+S);
		return S;
	}
	public float SimpleInterest(float p,float t,float r )
	{
		float SI;
		SI=(p*t*r)/100;
		System.out.println("Simple interest is"+SI);
		return SI;
	}
	public double Area(double r)
	{
		double a;
		a=3.1*r*r;
		System.out.println("Area IS :"+a);
		return a;
		
	}
	
	
}
