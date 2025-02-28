package practice_scripts;

public class Array_1DScript {

	public static void main(String[] args)
	{
	  int age[] = new int[5];
	  age[0]= 40;
	  age[1]= 25;
	  age[2]= 43;
	  age[3]= 36;
	  age[4]= 28;

//	  System.out.println("Computing value : "+age);      the result is  [I@27f674d
	  System.out.println("Print the value : "+age[1]);

	  System.out.println();

	//Using loop statement

	  for (int i=0; i<5; i++)                                                //or we can use i<=4 also
	  {
		  System.out.println("Print the value : "+age[i]);
	  }

     System.out.println("---------------------Array Literal------------------");

     //Array Literal

     int age1[] = {10,20,30,40,50,60,70,80,90,11,22,33,44,55,66,77,88,99};

     for (int i=0; i<18 ; i++)
     {
    	 System.out.println("Array Literal : "+age1[i]);
     }

     System.out.println("--------------------------------------------------");

     //Array Literal------------------Using Length

     int age2[] = {10,20,30,40,50,60,70,80,90,11,22,33,44,55,66,77,88,99};

     for (int element : age2) {
    	System.out.println("Array Literal : "+element);
     }

     System.out.println("-------------------------------------");

     //Default value  ----------------------It will show default value zero

     int age3[]= new int[5];

     age3[0]=45;
   //age3[1]=58;
     age3[2]=69;
   //age3[3]=32;
     age3[4]=87;

     for (int element : age3) {
      System.out.println("Default value using length : "+element);
     }

     System.out.println("---------------------------------------");

    // for loop for string

   String [] name = new String[4];

     name[0]= "Amit";
     name[1]= "Aman";
     name[2]= "Shubham";
     name[3]= "Akshay";

     for (String r:name)
     {
    	System.out.println("String data : "+r);
     }

     System.out.println("-----------------------------------------");

    //String Default Value    ------------------------- It will show default value null

     String [] name1 = new String[4];

     name1[0]= "Amit";
   //name1[1]= "Aman";
     name1[2]= "Shubham";
     name1[3]= "Akshay";

     for (String r:name1)
     {
    	 System.out.println("String data : "+r);
     }




	}

}
