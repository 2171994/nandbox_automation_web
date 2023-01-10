package Omartarek;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class excel_data {

	public static void main(String[] args) throws InvalidFormatException ,IOException {
		
		File myfile = new File ("E:\\Omar Tigo\\Selenium\\data.xlsx");
		XSSFWorkbook xwb = new XSSFWorkbook (myfile) ;
        XSSFSheet mysheet = xwb.getSheet("Sheet1")   ;//xssfsheet dh ba3ml mno refrence variable 3ashan law 
        //3ayz at7km fe ay 7aaga gowa al sheet ale gowa excel ama xssfworkbook ba3ml mno object law 3ayz 
        //at7k fe excel mn bara 
        xwb.close();
        int row_count = mysheet.getPhysicalNumberOfRows();
        int coloum_count = mysheet.getRow(0).getPhysicalNumberOfCells();
        for (int i = 0 ; i<row_count ; i++) {
        	for (int j = 0 ; j<coloum_count ; j++) {
        		System.out.print(mysheet.getRow(i).getCell(j).getStringCellValue()+"|");
        	}
        	System.out.println("\n");
        }
	}

}
