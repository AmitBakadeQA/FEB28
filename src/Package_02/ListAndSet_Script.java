package Package_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListAndSet_Script
{

	public static void main(String[] args)
	{
		int a[][]= new int[2][2];
		a[0][1]=10;

		System.out.println(a);
	/*
		ArrayList al=new ArrayList();       //----simple object creation

		List l=new ArrayList();             //----Reference object creation

		HashSet hs=new HashSet();           //----simple object creation

		Set s=new HashSet();                //----Reference object creation
		*/


		//Methods of collection interface for set
		Set s=new HashSet();
		s.add(10);
		s.add("Varun");

		System.out.println(s);

		Set s1=new HashSet();
		s1.add(10);
		s1.add(20);
		s1.add(30);


		System.out.println(s1);
		System.out.println("Object contains in  list "+s1.contains(20));

		Set s2=new HashSet();
		s2.add("AAA");
		s2.add("BBB");
		s2.add("Akshay");

		System.out.println(s2);

	/*	s1.add(s2);
		System.out.println(s1);*/

		s1.addAll(s2);
		System.out.println(s1);

		Set s3=new HashSet();
		s3.add(10);
		s3.add(20);
		s3.add(30);

		System.out.println("Object contains all in  list "+s1.containsAll(s3));

		// for check
		// isEmpty

		Set s4=new HashSet();
		s4.add("AAA");
		s4.add("BBB");
		s4.add("Akshay");
		s4.add(100);
		s4.add(200);
		s4.add(300);

		System.out.println("Check data "+s4);
		System.out.println("Remove data "+s4.remove(100));

		System.out.println(s4);

		//same for remove all , just like in list

		System.out.println("--------------------------------------------------------------------------------------------");

		                                       // Restrictions

		Set<Integer> s5=new HashSet<>();    //----------------------here <> for new HashSet is not mandatory
		s5.add(10);
		s5.add(20);
		s5.add(30);
	//	s5.add("AAA")                        // here we cannot take String data as it is restricted (only int data)

		Set<String> s6=new HashSet<>();
		s6.add("AAA");
		s6.add("BBB");
		s6.add("CCC");

		//Duplicate data for List Set

		ArrayList al=new ArrayList();
		al.add(100);

		System.out.println(al.add(100));
		System.out.println(al);

		HashSet hs=new HashSet();
		hs.add(100);

		System.out.println(hs.add(100));                 //----here in set it will not allow for duplicate data to be stored .
		System.out.println(hs);


		//null values for List and Set

		ArrayList al1=new ArrayList();
		al1.add(null);

		System.out.println(al1.add(null));
		System.out.println(al1);

		HashSet hs1=new HashSet();
		hs1.add(null);

		System.out.println(hs1.add(null));                 //----here in set it will  allow only one null value .
		System.out.println(hs1);

		System.out.println("-----------------------------------------------------------------------------------");

		//Insertion order

		ArrayList al2=new ArrayList();
		al2.add(0,100);
		al2.add(1,200);
		al2.add(2,900);
		al2.add(3,10);

		System.out.println(al2);

		Set t=new TreeSet();
		t.add(500);
		t.add(300);
		t.add(456);
		t.add(120);

		System.out.println(t);

		Set t1=new TreeSet();
		t1.add("gg");
		t1.add("ff");
		t1.add("aa");
		t1.add("ll");

		System.out.println(t1);
	}

}
