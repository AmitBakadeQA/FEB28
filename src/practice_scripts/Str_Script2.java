package practice_scripts;

public class Str_Script2 {

	public static void main(String[] args)
	{
	  String s = "Incredable";
	  String a = "Akshay";
	  String b = "abc123@gmail.com";
	  String c = "Welcome ";
	  String d = "to java";

      //Method--1 Length

	  System.out.println("Length : "+s.length());
	  System.out.println("Length : "+b.length());

	  //Method--2 concate

	  System.out.println("Adding 2 string data : "+c.concat(d));

	  //Method--3 Trim

	  String e = " Everyone ";

	  System.out.println("Before Trim : "+e);
	  System.out.println("After Trim : "+e.trim());

	  //Method--4 charAt

	  System.out.println("Chack index value (place value of character) : "+b.charAt(9));
	  System.out.println("Chack index value (place value of character) : "+c.charAt(6));

	  //Method--5 contains--------------as booleans (True/False)

	  System.out.println("Check whether given script contain word : "+d.contains("ava"));
	  System.out.println("Check whether given script contain word : "+d.contains("avaa"));

	  //Method--6  Equals-----------------True/Fales

	   String name= "Kritika";

	   System.out.println("Compare string data with given data : "+name.equals("Kritika"));
	   System.out.println("Compare string data with given data : "+name.equals("kritikA"));

	  //Method--7 EqualsIgnoreCases--------------True/False

	   System.out.println("Compare string data with given data : "+name.equalsIgnoreCase("Kritika"));
	   System.out.println("Compare string data with given data : "+name.equalsIgnoreCase("kritikA"));

	  //Method--8 Substring  starts from index no. counting ---------ends on normal no. counting

	   String z = "Birthday";
	   String x = "Journey";

	   System.out.println("Substring with start and end point : "+z.substring(5, 8));
	   System.out.println("Subsrting with only start point : "+x.substring(4));

	  //Method--9 Replace

	   String y = "Happy Birthday";

	   System.out.println("Replace word : "+y.replace("Birthday", "Journey"));
       System.out.println("Replace single character : "+y.replace('y', 'i'));





	}

}
