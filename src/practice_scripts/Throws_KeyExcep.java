package practice_scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Throws_KeyExcep                                   //Scenario
{
	void FileRead() throws FileNotFoundException                        // 1) file is existing (Assumption)--in real, file is not present
	{                                                                   // throws key word use instead of try catch (Exception handling)
		FileInputStream fr=new FileInputStream("d:/abc.txt");
		System.out.println("abc file not found");
	}
	void FileWrite() throws FileNotFoundException                       // 2) file do not exist as the said location
	{                                                                         // exception occured in real after execution----------using try catch
		FileOutputStream fw=new FileOutputStream("d:/new.txt");
		System.out.println("new file not found");

	}

	public static void main(String[] args) throws FileNotFoundException
	{
		Throws_KeyExcep tk=new Throws_KeyExcep();
		try {
		tk.FileRead();                                                    //  we can write try catch sepaterly also (For fileread and filewrite )
		tk.FileWrite();
		}
		catch (Exception e)
		{
			System.out.println("File--------abc Exception handled "+e);
			System.out.println("File--------new Exception handled "+e);

		}

		System.out.println("Rest of code");

	}
}
