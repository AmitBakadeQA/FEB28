package FileHandling_Scripts;

import java.io.FileReader;
import java.io.IOException;

public class File_ReadScript
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("d://NewFile.txt");

		try
		{
			int i;
			while((i=fr.read())!=-1)
			{
			//	System.out.println(i);
			//	System.out.println((char)i);
				System.out.print((char)i);
			}
		}
		finally
		{
			fr.close();
		}

	}

}
