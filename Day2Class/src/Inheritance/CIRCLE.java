package Inheritance;

public class CIRCLE extends Shape {
	public float area(float radius)
	{
		Area=3.14f*radius*radius;
		System.out.println("Area of circle is :"+Area);
		return Area;
	}
}
