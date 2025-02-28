package practice_scripts;

public class Exception_001
{

	public static void main(String[] args)
	{

		System.out.println(10/2);
		System.out.println(20/2);
		System.out.println(30/2);
		try
		{
		System.out.println(40/0);
		}
	/*	catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}*/
		finally
		{
		System.out.println(50/2);
		System.out.println(60/2);
		System.out.println(70/2);
		}

		System.out.println("Rest of code");
	}

}
