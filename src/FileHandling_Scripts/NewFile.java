package FileHandling_Scripts;

import java.io.File;
import java.io.IOException;

public class NewFile {

	public static void main(String[] args) throws IOException
	{
		File n =new File("D://TextFile.txt");
		
		if(n.createNewFile())
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File not created");
		}

	}

}
