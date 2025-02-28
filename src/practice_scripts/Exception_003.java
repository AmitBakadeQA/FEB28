package practice_scripts;

public class Exception_003 {

	public static void main(String[] args)
	{
		try
		{
		int a=100;
		int b=0;
		int c=a/b;

		System.out.println(c);

		}
		catch (Exception e)
		{
			System.out.println(e+" Main Exception ");

			try
			{                                           //risky code
				int []a=new int[2];
				a[4]=1;
				System.out.println(a[4]);
			}
			catch (Exception e1)
			{
				System.out.println(e1+" second exception ");
			}
			finally
			{
				System.out.println("I am finally block for catch ");
			}
		}
		finally
		{
			System.out.println("finally block for out side catch ");
		}

		System.out.println("Rest of code");

	}

}
