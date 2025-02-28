package practice_scripts;

class Primary_Pack02
{
	//private void black()                                     // private
	void black()                                               // default
	{
		System.out.println("Second class --- black ");
	}
}
public class Primary_Pack01
{
	private void purple()
	{
		System.out.println("First class ---- purple ");
	}

	public static void main(String[] args)
	{
		Primary_Pack01 a= new Primary_Pack01();
		a.purple();

		Primary_Pack02 b= new Primary_Pack02();
		b.black();                                           //************************************ as we use private in sub-class,it will only work within the class
                                                            // we can use default as default work in class as well as within the package.

	}

}
