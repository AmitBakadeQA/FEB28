package practice_scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Throws_KeyExcep01                                   //Scenario
{
	void FileRead() throws FileNotFoundException                        // 1) file is existing (Assumption)--in real, file is not present
	{                                                                   // throws key word use instead of try catch (Exception handling)
		FileInputStream fr=new FileInputStream("d:/abc.txt");
		System.out.println("abc file found");
	}
	void FileWrite() throws FileNotFoundException                       // 2) file do not exist as the said location
	{                                                                         // exception occured in real after execution----------using try catch
		FileOutputStream fw=new FileOutputStream("d:/new.txt");
		System.out.println("new file found");                           // 3) file Exist in real --------using Throws keyword------Declaration

	}

	public static void main(String[] args) throws FileNotFoundException
	{
		Throws_KeyExcep01 tk=new Throws_KeyExcep01();

		tk.FileRead();
		tk.FileWrite();

		System.out.println("Rest of code");

	}                                                                     // note --- in this we create abc.txt file in d:
	                                                                           //to show that the file exist in real

	                                                                      // and as new file is FileOutStream it will create automatically after abc is created
}

