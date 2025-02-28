package practice_scripts;
class AA_02
{
	void Word_A()
	{
		System.out.println("Grandfather------------Word A ");
	}
}
class BB_02 extends AA_02
{
	void Word_B()
	{
		System.out.println("Father-----------------Word B ");
	}
}

public class CC_02 extends BB_02
{
    void Word_c()
    {
    	System.out.println("Child-------------------Word C ");
    }

	public static void main(String[] args)
	{
		CC_02 xy=new CC_02();
		xy.Word_c();
		xy.Word_B();
		xy.Word_A();

	}

}
