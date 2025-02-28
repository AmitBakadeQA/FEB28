package practice_scripts;
                                                                                       // Method Overloading ---------Compiler time polymorphism
public class MethodOverloadingScript                                                   // Same class---------same method name
{                                                                                      // Arguments should be different ---1) no. of Arguments
    void White(int a,String b)                                                                                          // 2) Sequence of argument
    {                                                                                                                   // 3) Type of argument
    	System.out.println("Method----1 "+a+" "+b);                                    // also known as compile time polymorphism
    }
    void White(String b,int a)
    {
    	System.out.println("sequence of argument "+b+" "+a);
    }

    void White(int a)
    {
    	System.out.println("Method----2 "+a);
    }

	public static void main(String[] args)
	{
		MethodOverloadingScript ab= new MethodOverloadingScript();
		ab.White(100, "Word");
		ab.White("a", 10);
		ab.White(100);

	}

}
