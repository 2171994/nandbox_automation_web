package event_utilities;


import java.io.File;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_excel1 {

	public String[][]read_sheet() throws InvalidFormatException, IOException  {
	
		File myfile =new File(".\\event_test_data\\event_test_data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook (myfile);
		 XSSFSheet mysheet = wb.getSheet("Sheet1");
	    wb.close();
	    int number_of_rows = mysheet.getPhysicalNumberOfRows();
	    int number_of_coloums = mysheet.getRow(0).getLastCellNum();
	     String[][] myarray = new String [number_of_rows-1][number_of_coloums];
	     
	     for (int i=1 ; i<number_of_rows ;i++) 
	        {
	    	 
	    	 for(int a=0 ;a<number_of_coloums ;a++) 
	    	   {
	    		 
	    		 XSSFRow row = mysheet.getRow(i);//row(1)
	    		 myarray[i-1][a] = row.getCell(a).getStringCellValue();
	    	   }
	    	 
	         }
		return myarray; 
		
		

	}

}


// public String[][] read_sheet() throws ioexception ,invalid 

// File myfile = new File(".\\test_data\\credential.xlsx");
//XSSFWorkbook wb = new XSSFWorkbook(myfile);
//XSSFSheet mysheet = wb.getSheet("Sheet1");








