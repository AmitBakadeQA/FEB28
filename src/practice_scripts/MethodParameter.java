package practice_scripts;

public class MethodParameter
{
     int a=10;
     String name="RRR";                                //instance variable

     static String Add="HID-101, Suncity Colony ";           //      static variable

     static int percentage;

	 public void userdefine(String name , int age, long mobile, double salary)
	  {
		  System.out.println(name +" age is "+age+" and mobile no. is "+mobile+" has salary "+salary);      //local variable
	  }

	/* public void userinfo()                                     // we dont have to write data again and again separately
	 {
		 String name="AAAA";
		 int age =45;
		// long mobile=78542365411;
		 double salary=78000;
	 }*/

	 public int Addition (int a, int b, int c)
	 {
		 int d=a+b+c;                                    // we can also take d=a+b  it will add 2 values only
		 System.out.println("Add no = "+d);
		 return d;
	 }

	 public static int subtraction(int a, int b, int c)
	 {
		 int e=a-c;
		 System.out.println("Subtraction = "+e);
		 return e;
	 }

	public static void main(String []args)
	{
		//percentage=22;

		MethodParameter m= new MethodParameter();
		m.userdefine("AAA", 40, 1234567891, 45896);
		m.userdefine("BBB", 45, 1256879568, 47851);
	 /* m.userdefine("CCC", 25, 9865321251, 47895);
	    m.userdefine("DDD", 56, 8945658541, 73620);*/

		m.Addition(110, 256, 100);

		subtraction(100, 50, 40);

	}

}
