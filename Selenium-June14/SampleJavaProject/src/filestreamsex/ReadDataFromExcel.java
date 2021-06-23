package filestreamsex;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("C:/Users/RAJU CHELLE/Desktop/Exampl1.xlsx");
		
		FileInputStream fis = new FileInputStream(file1);		 

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = workbook.getSheet("Sheet1");
		
		Iterator<Row> allRows =  sheet1.iterator();
		
		while(allRows.hasNext()){
			
			Row row1 = allRows.next();
			
			Iterator<Cell> allCells =  row1.cellIterator();
			
			while(allCells.hasNext()){
				System.out.println(allCells.next());
			}
		}

	}

}
