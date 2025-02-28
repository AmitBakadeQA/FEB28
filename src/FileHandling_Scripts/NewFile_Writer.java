package FileHandling_Scripts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewFile_Writer {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw =new FileWriter("D://TextFile.txt");
		
		try
		{
	    fw.write("The First Line");
		}
		finally
		{
		 fw.close();	
		}
		
     
	}

}
