package practice_scripts;

public class Exception_Script
{

	public static void main(String[] args)
	{
		System.out.println(10/2);
		System.out.println(20/2);
		System.out.println(30/2);
		try
		{
		System.out.println(40/0);                    //Exception occured----unchecked exception ---------run time exception
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();                                                 // we use this for stack Trace
			System.out.println(e.getMessage());                                  // for getting massage
		}
		System.out.println(50/2);
		System.out.println(60/2);
		System.out.println(70/2);


	}

}
