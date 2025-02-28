package FileHandling_Scripts;

import java.io.File;
import java.io.IOException;

public class Create_File02
{

	public static void main(String[] args) throws IOException
	{
        File f=new File("d://NewFile.txt");

        f.createNewFile();

		if(f.exists())
		{
			System.out.println("File is created");
			System.out.println("File Name : "+f.getName());
			System.out.println("File Location : "+f.getAbsolutePath());
			System.out.println("File Readable : "+f.canRead());
			System.out.println("File Writable : "+f.canWrite());
			System.out.println("File Size : "+f.length());
		//	System.out.println("File Delete : "+f.delete());
		}
		else
		{
			System.out.println("File is not created");
		}


	}

}
