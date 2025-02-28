package practice_scripts;

public class Boolean_Expression {

	public static void main(String[] args)
	{
     int a=50;                                         //Boolean expression also known as Relational operators
     int b=30;
     int c=30;

     System.out.println(a > b);
     System.out.println(a >= b);
     System.out.println( a < b );
     System.out.println(a <= b);
     System.out.println(a == b);
     System.out.println(a != b);

     System.out.println("And-----------&& ,Or----------|| ");

     System.out.println(a > b && b > c);
     System.out.println(a > b && b >= c);
     System.out.println(a > b || b > c);
     System.out.println(a < b || b > c);
     System.out.println(a > b != b > c);




	}

}
