package Package_02;

import java.util.ArrayList;

public class Collect_Frm
{
   public static void main(String[] args)
	{
		 int a[]= new int[4];
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;

		 for(int i=0 ; i<4 ;i++)
		 {
			 System.out.println(a[i]);
		 }

		 ArrayList al= new ArrayList();
		 al.add(10);
		 al.add("Gagan");
		 al.add("A");
		 al.add(52.03);
		 al.add(456589);
		 al.add("Abc@gmail.com");

		 System.out.println(al);

	}

}
