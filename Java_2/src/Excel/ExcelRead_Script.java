package Excel;

import java.io.FileInputStream;  
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead_Script
{

	public static void main(String[] args) throws IOException
	{
		String filepath="d://EmployeeData.xlsx";                                      // Location
		FileInputStream outputstream=new FileInputStream(filepath);                   // Class ---- Reading
		
		XSSFWorkbook workbook = new XSSFWorkbook (filepath);                          // Workbook available location
		XSSFSheet sheet = workbook.getSheetAt(0);                                     // Get sheet with index value (which no. of sheet do we required )
		
	//  Using while loop ----------- iterator class
		
		Iterator  rowsitr =sheet.iterator();                                          // Row--------forward print-------loop
		while(rowsitr.hasNext())
		{
			XSSFRow row=(XSSFRow)rowsitr.next();                                      // Row class----------Iteration
			
			Iterator cellitr=row.iterator();                                          // Column loop-----forward direction
			while(cellitr.hasNext())
			{
				XSSFCell cell=(XSSFCell)cellitr.next();                               // Cell class iteration
				
				switch (cell.getCellType())
				{
				case STRING: System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());          // Type of data 
				break;	
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());
				break;

				
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		
		

	}

}
