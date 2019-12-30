package Inheritance;

public class Rectangle extends Shape {
	
	public float area(float length,float breadth)
	{
		Area=length*breadth;
		System.out.println("Area of rectrangle is :"+Area);
		return Area;
	}

}
