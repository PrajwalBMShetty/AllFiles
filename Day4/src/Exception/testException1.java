package Exception;

public class testException1{
	public void method1(){
	try
	{
		int x=10;
		int y=0;
		int z=x/y;
	}
	catch(Exception e)
	{
		System.out.println("Divide by zero error");
	}

	}
	public void checkAge(int age) throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException("You are not an adult");
		else
			System.out.println("You are an adult and can vote");
	}
	public void method2() throws Exception {
		int x=10/0;
		
	}
	public void method3()
	{
		try {
		int [] a=new int[3];
		a[0]=10;
		a[1]=10;
		a[2]=10;
		a[3]=10;
	       }
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Referring out of array size");
		}
}
}