import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

//import jdk.internal.org.jline.utils.OSUtils;
import org.apache.commons.collections4.SplitMapUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

public class ExcelReading {


    public static void main (String [] args) throws IOException {

try {
    File file = new File("file_example_XLS_100.xls");
    FileInputStream fis = new FileInputStream(file);
    HSSFWorkbook wb = new HSSFWorkbook(fis);
    HSSFSheet sh = wb.getSheet("Sheet1");

//    HSSFCell cell2 = row1.getCell(1);
//    System.out.println(cell2);

    int rowCount = sh.getLastRowNum() - sh.getFirstRowNum() +1;
    for (int i =0; i < rowCount ; i++){


        int cellCount = sh.getRow(i).getLastCellNum();

        System.out.println("Row " + i  + "data is");

        for (int j=1; j<cellCount ; j++){
            HSSFRow row = sh.getRow(i);

            Cell cell = row.getCell(j);
            if (cell.getCellType() == CellType.NUMERIC) {
                double numericValue = cell.getNumericCellValue();
                String stringValue = String.valueOf(numericValue);
                System.out.println(stringValue);// Convert numeric to string
            } else if (cell.getCellType() == CellType.STRING) {
                String stringValue = cell.getStringCellValue();
                System.out.println(stringValue);
            }
        }
        System.out.println();


    }
    wb.close();
    fis.close();
}
catch (Exception e) {e.printStackTrace();}


    }


}
