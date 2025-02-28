package FileHandling_Scripts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_WriteScript
{

	public static void main(String[] args) throws IOException
	{
      //Create File

		File f=new File("d://NewFile.txt");
		f.createNewFile();

		System.out.println("The file is created ");

		// Writing data in file

		FileWriter fw=new FileWriter("d://NEWFile.txt");

		try
		{
			fw.write("Hello World");
		}
		finally
		{
			fw.close();
		}

	}

}
