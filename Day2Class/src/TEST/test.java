package TEST;

import java.util.Scanner;

import AllMethods.Calculation;
import Inheritance.CIRCLE;
import Inheritance.Plant;
import Inheritance.Rectangle;
import Inheritance.Rose;
import Inheritance.Shape;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calculation x=new Calculation();
		x.SimpleInterest();
		x.Area();
		String Greet=x.GREETING();
		System.out.println(Greet);*/
		/*Calculation x=new Calculation();
		System.out.println("Enter choice 1 for Addition of two numbers");
		System.out.println("Enter choice 2 for Addition of two Strings");
		System.out.println("Enter choice 3 for Simple Interset");
		System.out.println("Enter choice 4 for arae of circle");
		/*int choice;
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: x.add(10, 2);
		break;
		case 2:x.AddString("Hello", "UppU");
        break;		
		case 3:x.SimpleInterest(2.1f,3.1f,6.1f);
		break;
		case 4:x.Area(5.8);
		break;
		default: System.out.println("Enter valid choice");
		}*/
		/*Shape s=new Shape();
		Rectangle r=new Rectangle();
		CIRCLE c=new CIRCLE();
         s.area();
         r.area(2,3);
         c.area(2);*/
		Plant p=new Rose();
		/*Plant p4=new Rose(2,"bbb","aa","rosy");*/-
		p.display();
	
	
         

	}
	

}
