package Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class HandleElementArray {

	public static void main(String[] args)
	{
		int []a= {1,45,68,95,45,45,14,56};
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("======================================");
		
		for(int element : a)
		{
			System.out.println(element);
		}
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
