package practice_scripts;

import java.io.FileInputStream;

public class Exception_Script2
{

	public static void main(String[] args) // throws FileNotFoundException
	{
	  try
	  {
		//Risky code
	  FileInputStream a = new FileInputStream("D:/abc.txt");	               // Checked exception ------- compile time exception
	  }
	  catch(Exception e)                                                       //Exception Handled ( With the help of try and catch )
	  {
		  System.out.println(e);
		  e.printStackTrace();                                                 // we use this for stack Trace
		  System.out.println(e.getMessage());                                  // for getting massage
	  }
	    System.out.println("Hello World ");                                    //Rest of code
	}

}
