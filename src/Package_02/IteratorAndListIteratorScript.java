package Package_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class IteratorAndListIteratorScript
{

	public static void main(String[] args)
	{
	   // List------------Iterator-------------Forward Direction

		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add("AAA");
		al.add(null);

		System.out.println(al);

		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		// ListIretator allows both Forward and Backward Print .

	/*	ListIterator it=al.listIterator();
		while (it.hasNext())
		{
			System.out.println(it.hasNext());
		}
		while (it.hasPrevious())
		{
			System.out.println(it.hasPrevious());
		}*/

		System.out.println("----------------------------------------------------------------------------------------------------------------");

		// set-----------Iterator-------------Forward Direction

		Set s=new HashSet();
		s.add(500);
		s.add(200);
		s.add("CFG");
		s.add(null);

		Iterator sit=s.iterator();
		while(sit.hasNext())
		{
			System.out.println(sit.next());
		}
		
		System.out.println();

		ListIterator litr=(ListIterator) s.iterator();
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		


	}

}
