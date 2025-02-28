package practice_scripts;

public class Exception_002 {

	public static void main(String[] args)
	{
		try
		{
			int a=10;
			int b=0;
			int c=a/b;

			System.out.println("c");
		}
		catch (ArithmeticException e)                         //-----------child 1
		{
			System.out.println("catch 1 "+e);
		}
		catch (ArrayIndexOutOfBoundsException e)              //-----------child 2
		{
			System.out.println("catch 2 "+e);
		}
		catch (Exception e)                                   //-----------parent        ( parent has to be come after the child )
		{
			System.out.println("Main catch "+e);
		}
		finally
		{
			System.out.println("I am finally ");
		}

		System.out.println("Rest of code ");



	}

}
