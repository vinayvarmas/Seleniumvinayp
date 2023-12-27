package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel  implements FrameWorkConstraint{
	
	public static File filepath=new File("EXCEl_PATH");
	
	public static Object[][]getMultipleData(String sheetname) throws IOException{
	FileInputStream fis=new FileInputStream(filepath);
	
	Workbook book=new XSSFWorkbook(fis);
	
	Sheet sheet=book.getSheet("Sheet1");
	
	int rowcount=sheet.getPhysicalNumberOfRows();
	
	int columncount=sheet.getRow(0).getPhysicalNumberOfCells();
	
	Object[][] data=new Object[rowcount][columncount];
	for(int i=0;i<=rowcount;i++) {
		
		for(int j=0;j<columncount;j++) {
			data[i][j]=sheet.getRow(i).getCell(j).toString();
		}
	}
	return data;
}
}
