package genaricliberies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/** 
 * tis class contains resuable methods with respect to excel 
 * 
 * @param exelpath
 */
public class ExcelUtility{
	
	private Workbook wb;
	/**
	 * this method is used to intialize excel file
	 * @param exccelpath
	 */
	
	public void excelInitization(String exccelpath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(exccelpath);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		 try {
			 wb = WorkbookFactory.create(fis);
		 } catch (EncryptedDocumentException IOException e  ){
			 e.printStackTrace();
		 }
		}
	/**
	 * this method is used to read single data from excel
	 * @param sheetNum
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public Cell redadData(String SheetName,int rowNum,int cellNum) {
		return wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum);
	}

	public Map<String,String> readData(String sheetname) {
		Map<String,String> map = new HashMap<>();
		Sheet sh = wb.getSheet(sheetname);
		for(int i=0; i <= sh.getLastRowNum();i++) {
			Cell cell = sh.getRow(i).getCell(0);
			Cell cell1 = sh.getRow(i).getCell(1);
			String key = cell1.getStringCellValue();
			String value = cell1.getStringCellValue();
			map.put(key, value);
		}
		return map;
	}
	
	 /**
	  * this method is used to close the workbook
	  
	  */
	public void closeworkbook() {
		try {
			wb.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	}
		
		
	


