package Excel;

import java.io.FileOutputStream; 
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite_Script
{

	public static void main(String[] args) throws IOException
	{
		XSSFWorkbook workbook=new XSSFWorkbook();                            // Workbook creation
		XSSFSheet sheet=workbook.createSheet("EmpPost");                     // Sheet creation
		
		Object emp[][]= {{"Emp id","Emp name","Post"},                       // Here Object is a parent data type which can store any type of data in it .    
				         {101,"AAA","Manual Tester"}, 
				         {102,"BBB","Devops"}, 
				         {103,"CCC","Team Lead"}, 
				         {104,"DDD","QA"}, 
				         {105,"EEE","Project Manager"}};
		
		int rows=emp.length;
		int columns=emp[0].length;                                             //Rows and Columns length define
		
	//	System.out.println("No of rows : "+rows);
	//	System.out.println("No of columns : "+columns);
		System.out.println("No of rows : "+rows+" No of columns : "+columns);
		
		for(int r=0 ; r<rows; r++)                                            // Row loop started
		{
			XSSFRow row=sheet.createRow(r);                                   // Row is created and data will get executed
			for(int c=0; c<columns; c++)                                      // Column loop started 
			{
				XSSFCell cell=row.createCell(c);                              // Column is created
				
				Object value=emp[r][c];                                       // value of different data type are asked to allow in sheet
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
			}
		}
		
		String filepath="d://EmployeeData.xlsx";
		FileOutputStream outputstream=new FileOutputStream(filepath);         // Here we define path with variable first and then use it .
		workbook.write(outputstream);
		
		outputstream.close();
		
		System.out.println("The excel file executed successfully");
		

	}

}
