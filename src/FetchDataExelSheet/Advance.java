package FetchDataExelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Advance {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file;
		
//		for(int i=1; i<=9; i++) {
//			FileInputStream file = new FileInputStream("C:\\Users\\kailas\\Desktop\\Kailas.xlsx");
//			 String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
//			 System.out.println(value);
//			
//		}
		
		
		
//		Reading the data from Multiple rows and multiple Column.
		
//		for(int i=0; i<=9; i++) {
//			for(int j=0; j<=1; j++) {
//				FileInputStream file = new FileInputStream("C:\\Users\\kailas\\Desktop\\Kailas.xlsx");
//				 String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
//				 System.out.println(value);
//			}
//		}
	
		
		
//		Reading Rows Values Dynamically
		
	
		 file = new FileInputStream("C:\\Users\\kailas\\Desktop\\Kailas.xlsx");
		 int rownum = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		 System.out.println(rownum);
		 
		 file = new FileInputStream("C:\\Users\\kailas\\Desktop\\Kailas.xlsx");
		 int column = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		 System.out.println(column);
		 
		 
		 for(int i=0; i<=rownum; i++) {
		 for(int j=0; j<column; j++) {
			 file = new FileInputStream("C:\\Users\\kailas\\Desktop\\Kailas.xlsx");
			 String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			 System.out.print(value+" ");
			 
		 }
		 System.out.println();
			 
		 }
		
		
		
		
		
		
	}

}
