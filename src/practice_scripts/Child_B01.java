package practice_scripts;
                                     //  Single Inharitance
class Parent_A01
{
	void Black()
	{
		System.out.println("Parent Method : Black ");
	}
}
public class Child_B01 extends Parent_A01
{
    void Red()
    {
    	System.out.println("Child Method : Red ");
    }
	public static void main(String[] args)
	{
		Child_B01 C= new Child_B01();
		C.Red();
		C.Black();

	/*	Parent_A01 P= new Parent_A01();        --------------- we dont have to call separetly ,we can use inharitance with the help of extend key word
		P.Black();	*/

	}

}
