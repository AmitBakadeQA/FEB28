package practice_scripts;

import java.util.Scanner;

//Throw keyword is use to Add exception in the Script Manually ( not imp )

class LessFlowerException extends RuntimeException                           //Inheritance
{
	LessFlowerException (String msg)                                        //Constructor
	{
		super(msg);                                                         //Customized exception message action
	}
}
public class Throw_KeyException
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);                                          //Scanner
		System.out.println("Enter the no.of flower : ");
		int flower = s.nextInt();

		if (flower <50)                                                               //If else statement
		{
			throw new LessFlowerException("Less then 50 flowers ");
		}
		else
		{
			System.out.println("Mode then 50 Flowers ");
		}

		System.out.println("Rest of code");

	}

}
