package practice_scripts;

import java.util.Scanner;

public class If_ElseLadder {

	public static void main(String[] args)
	{
	/*	Scanner sc= new Scanner(System.in);                ------------- we can also use Scanner for this type of Scripts.
		int age=sc.nextInt();*/
		
		int age=22;

		if (age < 18)
		{
			System.out.println("Under age---not eligible for vaccine");
		}
		else if (age >= 18 && age < 45)
		{
			System.out.println("Eligible for 1st vaccine");
		}
		else if (age >= 45 && age <= 60)
		{
			System.out.println("Eligible for 2nd vaccine");
		}
		else
		{
			System.out.println("Not Eligible");
		}

	}

}
