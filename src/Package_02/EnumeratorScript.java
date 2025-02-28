package Package_02;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class EnumeratorScript
{

	public static void main(String[] args)
	{
		Stack s=new Stack();                             // here Vector and Stack are Legacy Classes ( old ) and Enumerator always work with Legacy classes only .

		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add("AAA");
		v.add(12.05);
		v.add(null);

		System.out.println(v);

		System.out.println("------------------------------------------------------");

		Enumeration e=v.elements();                  //----------------------------------------------------------------------
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}


	}

}
