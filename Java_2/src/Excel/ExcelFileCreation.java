package Excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileCreation
{

	public static void main(String[] args) throws IOException
	{
		XSSFWorkbook wb=new XSSFWorkbook();                                            // Workbook creation / extract
		
	//	FileOutputStream s=new FileOutputStream("d://StudentData.xlsx");               // Location and extension provide
		FileOutputStream s=new FileOutputStream(".//Student_Info//Studentdata.xlsx");  // java internal location( The folder should be on same project )
		
		XSSFSheet ss=wb.createSheet("StName");                                         // Sheet creation with name
		wb.write(s);                                                                   // Rows and columns activated
		System.out.println("The excel is created ");

	}

}
