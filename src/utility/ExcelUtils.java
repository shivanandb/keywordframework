package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
public static XSSFWorkbook xwb;
public static XSSFSheet xs;
public static XSSFCell xc;

public static void setExcel(String path,String SheetName) throws IOException {
	FileInputStream fs = new FileInputStream(path);
	xwb = new XSSFWorkbook(fs);
	xs = xwb.getSheet(SheetName);

}

public static String getExcel(int row, int col) {
	try{
		xc = xs.getRow(row).getCell(col);
	 
		 
		
	System.out.println(xc);
	String xcD =xc.getStringCellValue();

	System.out.println(xcD);
	return xcD;
	
	}
	catch(NullPointerException e){
		e.printStackTrace();
	
	}
	return null;
}
}
