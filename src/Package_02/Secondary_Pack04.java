package Package_02;

//import practice_scripts.Primary_Pack01;                      // here import form practice_script( Package ) . primary_pack01( class )

// we use * for all classes present in the package
import practice_scripts.Primary_Pack001;

public class Secondary_Pack04 // extends Primary_Pack001        //for protected we have to use extends key-word but
{                                                               // for public we can run without extends key-word

	public static void main(String[] args)
	{
	  /*Secondary_Pack04 c=new Secondary_Pack04();
		c.purple();*/

		Primary_Pack001 a=new Primary_Pack001();
		a.purple();

	}

}
