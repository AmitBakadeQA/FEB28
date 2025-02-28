package practice_scripts;
                                                                                           //Method Overriding ---------run time polymorphism
class A                                                                                    // different class---------same method name
{                                                                                          // Arguments should be same ---1) no. of Arguments
	void White(int a, String b)                                                                                        // 2) Sequence of argument
	{                                                                                                                  // 3) Type of argument
		System.out.println("White class--Parent "+a+" "+b);                                // uses Inharitance
		                                                                                   // also known as run time polymorphism
	}
}
class B extends A
{
	@Override
	void White(int a, String b)
	{
		System.out.println("White class-- Child "+a+" "+b);
	}
	/*void Black()
	{
		System.out.println("Black class--Child 1");
	}*/
}
public class MethodOverridScript extends A
{
    void white(int a, String b)
    {
    	System.out.println("White class -- Child_2 "+a+" "+b);
    }

	public static void main(String[] args)
	{
		/*A a= new A();
		a.White();

		B b=new B();
		b.White();
		b.Black();*/
		B b= new B();
		b.White(10, "AAA");

		MethodOverridScript ab= new MethodOverridScript();
		ab.white(20, "BBB");

	}

}
