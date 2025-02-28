package practice_scripts;

public class Array_2DScript {

	public static void main(String[] args)
	{
	  int[][]a= new int[2][3];             //Element/Size value
	  a[0][0]=10;
	  a[0][1]=20;
	  a[0][2]=30;
	  a[1][0]=40;
	  a[1][1]=50;
	  a[1][2]=60;

	  //System.out.println("Computing Value : "+a);
	  System.out.println("2D Array print : "+a[0][1]);

	  System.out.println("-------------------Matrix Array------------------- ");

	  System.out.println("Matrix Array Length of Row : "+a.length);
	  System.out.println("Matrix Array Length of Column : "+a[0].length);              //Here [] is for columns

	  System.out.println("-----------------------Jagged Array----------------");

	  int[][]b= new int[2][];                        // Row = total size of data
	  b[0]= new int [3];                             //[]=Row with index value and    new int []= Column= total size of data of column
	  b[1]= new int[2];

	  b[0][0]=100;
	  b[0][1]=200;
	  b[0][2]=300;
	  b[1][0]=400;
	  b[1][1]=500;

	  System.out.println("Jagged Array Length of Row : "+b.length);
	  System.out.println("Jagged Array Length of Column : "+b[0].length);
	  System.out.println("Jagged Array Length of Column : "+b[1].length);

	  System.out.println("-------------Literal Matrix Array-----------------");

	  int[][]d= { {10,20,30,40},{50,60,70,80} };             //-----------------(row 1),(row 2)

	  System.out.println("Literal Matrix Array Length of row : "+d.length);
	  System.out.println("Literal Matrix Array Length of column : "+d[0].length);

	  System.out.println("-----------------------Literal Jagged Array---------------------");

	  int[][]e= { {10,20,30} , {50,60,70,80,90} };

	  System.out.println("Literal Jagged Array Length of row  : "+e.length);
	  System.out.println("Literal Jagged Array Length of column  : "+e[0].length);
	  System.out.println("Literal Jagged Array Length of column  : "+e[1].length);

	  System.out.println("------------------Loops for Matrix Array---------------- ");

	  int[][]c={ {10,20,30,40},{50,60,70,80} };
	  for (int[] element : c) {
		  for (int element2 : element) {
			  System.out.println("Length "+element2);
		  }
	  }

	   System.out.println("------------------------Print in Table Formate------------");

	   int[][]f={ {10,20,30,40},{50,60,70,80} };
		  for (int[] element : f) {
			  for (int element2 : element) {
				  System.out.print(element2+" ");                   //for table formate remove ln from println
			  }
			  System.out.println();

		  }

		System.out.println("---------------------Loops for Jagged Array-------------------");

		  int[][]g={ {10,20},{50,60,70,80} };

		  for (int[] element : g) {
			  for (int element2 : element) {
				  System.out.print(element2+" ");
			  }

			  System.out.println();
		  }

	}

}
