package FileHandling_Scripts;

import java.io.FileReader;
import java.io.IOException;

public class NewFile_Reader {

	public static void main(String[] args) throws IOException
	{
		FileReader fr =new FileReader("D://TextFile.txt");
		
		try
		{
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		}
		finally
		{
			fr.close();
		}
		

	}

}
