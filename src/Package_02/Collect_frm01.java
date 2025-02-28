package Package_02;

import java.util.ArrayList;

public class Collect_frm01
{

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);

		System.out.println(al);
		System.out.println("Object contains in list is "+al.contains(500));    //----contains -----to check al is containing the given data or not.
		System.out.println("Object contains in list is "+al.contains(100));


		ArrayList al2=new ArrayList();
		al2.add("aa");
		al2.add("bb");
		al2.add("cc");

		System.out.println(al2);

		//al.add(al2);                                                                             // -----add--------adding al2 in al, but al2 will be in the [] .
		//System.out.println(al);

		al.addAll(al2);
		System.out.println("All object is stored at one place "+al);          //-----add all--------adding al2 data in al without [] .

		ArrayList al3=new ArrayList();                                      // --------------contains all
		al3.add(100);
		al3.add(200);
		al3.add(300);

		System.out.println("All object contain in list for both collection "+al.containsAll(al3));

		ArrayList al4=new ArrayList();
		al4.add(100);
		al4.add(200);
		al4.add(300);
		al4.add("aa");
		al4.add("bb");
		al4.add("cc");
		                                                           //------clear------for clearing all data from list .
		al4.clear();
		System.out.println("All data is cleared "+al4);

		System.out.println("the storage is available "+al4.isEmpty());  //----isEmpty------to check list is empty or not .

		ArrayList al5=new ArrayList();
		al5.add(100);
		al5.add(200);
		al5.add(300);
		al5.add("aa");
		al5.add("bb");
		al5.add("cc");

		System.out.println("Check data "+al5);                        //------check-----to check data is present or not .

	//	System.out.println("Remove data "+al5.remove(100));           // -----it gives exception because it is asking for an index value and we put data instated .
        System.out.println("Remove data "+al5.remove(0));            // ----- it will now remove 100 as we gave index value 0 .

       // al5.remove(1);                                             // we can also write this
       //System.out.println(al5);

        ArrayList al6=new ArrayList();
		al6.add(100);
		al6.add(200);
		al6.add(300);
		al6.add("aa");
		al6.add("bb");
		al6.add("cc");


		ArrayList al7=new ArrayList();
		al7.add(100);
		al7.add(200);
		al7.add(300);
		al7.add("aa");
		al7.add("bb");
		al7.add("cc");

		al6.removeAll(al7);                                    //----remove all----remove all duplicate data from al6 .
		System.out.println("Remove collection "+al6);
		System.out.println(al7);

		System.out.println("No of object "+al7.size());        //----size----to check no of object .

        
	}

}
