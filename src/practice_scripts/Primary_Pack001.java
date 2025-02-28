package practice_scripts;

class Primary_Pack002
{
	//protected void black()                                          // protected (can work outside package by sub-class)
	public void black()                                               // public (can work outside the package)
	{
		System.out.println("Second class --- black ");
	}
}
public class Primary_Pack001
{
	//protected void purple()
	public void purple()
	{
		System.out.println("First class ---- purple ");
	}

	public static void main(String[] args)
	{
		Primary_Pack001 a= new Primary_Pack001();
		a.purple();

		Primary_Pack002 b= new Primary_Pack002();
		b.black();

	}

}

