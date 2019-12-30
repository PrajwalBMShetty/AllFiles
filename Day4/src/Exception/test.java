package Exception;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
testException1 e=new testException1();
e.method1();
try
{
	e.method2();
}
catch(Exception e1)
{
	System.out.println("Divide by zero");
}
try
{
	e.checkAge(4);
}
catch(Exception e1)
{
	System.out.println(e1);
}

	}

}
