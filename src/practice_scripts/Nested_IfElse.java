package practice_scripts;

public class Nested_IfElse {

	public static void main(String[] args)
	{
     int a=20;
     int b=30;
     int c=40;

     if (a<b)
     {
    	 if (c>b)
    	 {
    		 System.out.println("Both the conditions are true");
    	 }

    	 else
    	 {
    		System.out.println("Second condition is false");
    	 }
     }
     else
     {
    	System.out.println("The first condition is fasle");
     }
	}

}
