package practice_scripts;

public class ConstructorOfSrtBuff {

	public static void main(String[] args)
	{
	 //Default Constructor---------empty string

		StringBuffer sb=new StringBuffer();
		System.out.println("Default capacity of StringBuffer : "+sb.capacity());

		StringBuilder sb1 = new StringBuilder();
		System.out.println("Default capacity of StringBuilder : "+sb1.capacity());

		System.out.println();

	 //String Constructor--------inpute capacity of string

		StringBuffer sb2= new StringBuffer("WELCOME");
		System.out.println("String capacity : "+sb2.capacity());

		StringBuilder sb3= new StringBuilder("WELCOME");                // it also count spaces
		System.out.println("String capacity : "+sb3.capacity());

		System.out.println();

	 //Int Constructor-----------Create capacity as per user defined length

		StringBuffer sb4= new StringBuffer(100);
		System.out.println("Int capacity given : "+sb4.capacity());

		StringBuilder sb5= new StringBuilder(100);
		System.out.println("Int capacity given : "+sb5.capacity());
	}

}
