package FileHandling_Scripts;

import java.io.File;
import java.io.IOException;

public class Create_File
{

	public static void main(String[] args) throws IOException
	{
		File f=new File("d://NewFile.txt");

		if(f.createNewFile())                                        //in case of exception we can use try catch here .
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File is not created");
		}

	}

}
