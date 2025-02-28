package practice_scripts;

public class ConstDemoScript
 {
   /*  ConstDemoScript()                                         //---------Constructor with no parameter(Default Constructor)
     {
    	 System.out.println("I am Constructor");
     }*/

	ConstDemoScript(String a, int b)                             //Constructor with parameter
	{
		System.out.println(a+" age is "+b);
	}

     public void abc()                                          //--------------Method
     {
    	 System.out.println("I am Method");
     }

     public static void main(String []args )
     {
    	// ConstDemoScript c=new ConstDemoScript();                 // for default constructor
    	 ConstDemoScript c=new ConstDemoScript("Amit",26);
    	 c.abc();
     }
}
