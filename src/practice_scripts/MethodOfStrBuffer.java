package practice_scripts;

public class MethodOfStrBuffer {

	public static void main(String[] args)
	{
	 //Method--1-----Length

		StringBuffer sb=  new StringBuffer("HELLO EVERYONE");
		System.out.println("Length : "+sb.length());

		System.out.println();

	 //Method--2------Delete

		StringBuffer sb1= new StringBuffer("Hello To Everyone");
		System.out.println("Delete : "+sb1.delete(5, 8));

		System.out.println();

	 //Method--3------Insert

		StringBuffer sb2= new StringBuffer("Hello Everyone");
		System.out.println("Insert : "+sb2.insert(6, "To "));

		System.out.println();

	 //Method--4------Replace

		StringBuffer sb3= new StringBuffer("Hello Everyone");
		System.out.println("Replace : "+sb3.replace(6, 14, "World"));

		System.out.println();

	 //Method--5-------DeleteCharAt

		StringBuffer sb4= new StringBuffer("Helloo World");
		System.out.println("Delete single character : "+sb4.deleteCharAt(5));

	}

}
