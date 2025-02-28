package practice_scripts;

import java.util.Scanner;

public class Sc_CircleParameter {

	public static void main(String[] args)                           //parameter of circle is 2πr
	{
      Scanner sc=new Scanner(System.in);

//      System.out.println("ENTER REDIUS OF CIRCLE : ");
//      int r=sc.nextInt();

      System.out.println("ENTER REDIUS OF CIRCLE : ");
      float r=sc.nextFloat();

      float π=3.141f;

      System.out.println("THE PARAMETER IS : "+2*π*r);

	}

}
