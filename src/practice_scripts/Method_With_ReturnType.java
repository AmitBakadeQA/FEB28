package practice_scripts;

public class Method_With_ReturnType {

	public int age(int a)
	{
		System.out.println("The age of kid is "+a);
		return a;
	}

	public boolean condition (boolean b)
	{
		System.out.println("The given condition is "+ b);
		return b;
	}

	public String colour(String s)
	{
		System.out.println("This "+s+" dress is very pretty");
		return s;
	}

	public static void main(String []args)
	{
		Method_With_ReturnType m=new Method_With_ReturnType();
		m.age(12);
		m.condition(true);
		m.colour("pink");
	}

}
