package FileHandling_Scripts;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CF {

	public static void main(String[] args) throws IOException
	{
	//	File f=new File("d://TextFile.txt");
	//	f.createNewFile();
		
	/*	FileWriter fw=new FileWriter("d://TextFile.txt");
		fw.write("hi my friend");
		fw.close();*/
		
		FileReader fr=new FileReader("d://TextFile.txt");
		
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}

}
