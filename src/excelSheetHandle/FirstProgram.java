package excelSheetHandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstProgram 
{
	public static void main(String[] args) throws IOException 
	{
		String adress="D:\\Testing Notes\\ExcelSheet\\selenium.xlsx";
		
		
		FileInputStream file=new FileInputStream(adress);
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet=book.getSheet("Sheet6");
		
//		String a=sheet.getRow(0).getCell(0).getStringCellValue();
//		System.out.println(a);
//		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=1;j++)
			{
				String a=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(a);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
