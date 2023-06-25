package upskill.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {
	
	public static Map<String, Map<String, String>> setMapData() throws Exception{
		
		String path = System.getProperty("user.dir")+"/src/test/resource/Datasheets/EbayDataSheet.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new XSSFWorkbook(fis);      //apache poi to acess any datasheet XML, or MS documents
		Sheet sheet = workbook.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		
		Map<String, String> dataMap = new HashMap<String, String>(); //key = Key of Excel, Value = value of Excel value
		Map<String, Map<String, String>> excelFileMap = new HashMap<String, Map<String, String>>();// key = datasheet name or # , value = key, value of the data sheets
		
		for (int i = 0; i<=lastRow; i++){					//Looping over entire row
			Row row = sheet.getRow(i);
			Cell keyCell = row.getCell(0); 					//0th cell as key, goes by column for example key = 0, value = 1, if anything was after it will be 2
			Cell valueCell = row.getCell(1);				//1st cell as value
			
			DataFormatter df = new DataFormatter();			//Cleaning up the data, example if there are any spaces or anything that will make the test fail
			String key = df.formatCellValue(keyCell);
			String value = df.formatCellValue(valueCell);
			
			dataMap.put(key, value);						//Putting key & value in dataMap
			excelFileMap.put("EbayDataSheet", dataMap);		//Putting dataMap to excelFileMap
		}
		
		return excelFileMap;								//Returning excelFileMap
	}
	
	public static String getMapData(String key) throws Exception{
		Map<String, String> m = setMapData().get("EbayDataSheet");
		String value = m.get(key);
		return value;
	}
	}