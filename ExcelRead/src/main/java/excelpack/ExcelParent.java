package excelpack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelParent {
	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	public static String getStringData(int a,int b) throws IOException
	{
		//a to take a row value
		//b to take cell value
		//PATH OF EXCEL
		f=new FileInputStream("C:\\excel\\Sheet1.xlsx");
		wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");//to take value from sheet getSheet()method used
		XSSFRow r=sh.getRow(a);//XSSSRow class imported,getRow() method to take value from row
		XSSFCell c=r.getCell(b);//XSSFCell class imported;getCell() method to take value from cell
		return c.getStringCellValue();
	}
   public static String getIntegerData(int a,int b)throws IOException
   {
	   f=new FileInputStream("C:\\excel\\Sheet1.xlsx");
	   wb=new XSSFWorkbook(f);
		sh=wb.getSheet("sheet1");//to take value from sheet getSheet()method used
		XSSFRow r=sh.getRow(a);//XSSFRow class imported,getRow() method to take value from row
		XSSFCell c=r.getCell(b);//XSSFCell class imported,getCell() method to take value from cell
		//c is an integer
		int x=(int)c.getNumericCellValue();
		return String.valueOf(x);//every value we need to convert to string

}

}

//	static FileInputStream f;//To take input from file
//	static XSSFWorkbook wb;//To take values from workbook
//	static XSSFSheet sb;//take values from sheet of workbook
//    public static String getStringData(int a,int b)
//    {//a-row
//    	//b-cellvalue
//    	f=new FileInputStream("‪C:\\Users\\user\\Desktop\\Book1.xlsx");
//    	wb=new XSSFWorkbbok(f);//throws
//    	sh=wb.getSheet("sheet1");//to take value from sheet
//    	XSSFRow r=sh.getRow(a);//get value from row-in sheet
//    	XSSFCell c=r.getcell(b);//get value from cell
//    	return c.getStringCellValue();
//    	
//    	//met
//   }//data in file
//    public static String getIntegerDat(int a,int b) throws IOException
//    f=new FileInputStream("‪C:\\Users\\user\\Desktop\\Book1.xlsx");
//    wb=new XSSFWorkbbok(f);//throws
//	sh=wb.getSheet("sheet1");//to take value from sheet
//	XSSFRow r=sh.getRow(a);//get value from row-in sheet
//	XSSFCell c=r.getcell(b);//get value from cell
//	//return c.getStringCellValue();
//	int x=(int)c.getNumericCellVlue();
//	//valueof-typeconversion
//	return String.valueOf(x);
//}

