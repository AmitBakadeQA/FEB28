package practice_scripts;

public class Multiple_Method
{
	public void Method_A()
	{
		System.out.println("the method A is executed");
	}
	public void Method_B()
	{
		System.out.println("the method B is executed");
	}
	public void Method_C()
	{
		System.out.println("the method C is executed");
	}
	public static void main(String args[])
	{
		Multiple_Method x=new Multiple_Method ();

		x.Method_A();
		x.Method_B();
		x.Method_C();
	}
}
