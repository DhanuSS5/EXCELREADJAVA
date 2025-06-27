package excelpack;
import java.io.IOException;


public class ExcelChild {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String s=ExcelParent.getStringData(2,0);//to take string value name cell
		System.out.println(s);
		System.out.println(ExcelParent.getIntegerData(2,1));//to take integer value cell age cell
		
       }
	}

