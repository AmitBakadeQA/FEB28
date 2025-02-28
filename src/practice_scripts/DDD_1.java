package practice_scripts;
                                                 //HIERARCHICAL INHERITANCE
class AAA_01
{
	void Black()
	{
		System.out.println("Parent class : Black ");
	}
}
class BBB_01 extends AAA_01
{
	void Pink()
	{
		System.out.println("Child class : Pink ");
	}
}
class CCC_01 extends AAA_01
{
	void Purple()
	{
		System.out.println("Child class : Purple ");
	}
}
public class DDD_1 extends AAA_01
{
	void White()
	{
		System.out.println("Child class : White ");
	}

	public static void main(String[] args)
	{
		DDD_1 d=new DDD_1();
		d.White();
		d.Black();

		BBB_01 b=new BBB_01();
		b.Pink();
		b.Black();

		CCC_01 c=new CCC_01();
		c.Purple();
		c.Black();
	}

}
