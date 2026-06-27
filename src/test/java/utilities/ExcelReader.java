package utilities;

import java.io.FileInputStream;


import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ExcelReader {

    private Workbook workbook;
    
    private DataFormatter formatter =
            new DataFormatter();

    public ExcelReader(String filePath) {

        try {

            FileInputStream fis =
                    new FileInputStream(filePath);

            workbook = new XSSFWorkbook(fis);

        } catch (IOException e) {

            throw new RuntimeException(
                    "Unable to open Excel file.",
                    e);
        }
    }

    public String getCellData(String sheetName,
					            int rowNumber,
					            int columnNumber) {

			Sheet sheet =
			workbook.getSheet(sheetName);
			
			Row row =
			sheet.getRow(rowNumber);
			
			return formatter.formatCellValue(
			row.getCell(columnNumber));
}
    
    
    public String getEmail(int rowNumber) {

        return getCellData(
                FrameworkConstants.LOGIN_SHEET,
                rowNumber,
                FrameworkConstants.EMAIL_COLUMN);
    }

    public String getPassword(int rowNumber) {

        return getCellData(
                FrameworkConstants.LOGIN_SHEET,
                rowNumber,
                FrameworkConstants.PASSWORD_COLUMN);
    }

    public String getStatus(int rowNumber) {

        return getCellData(
                FrameworkConstants.LOGIN_SHEET,
                rowNumber,
                FrameworkConstants.STATUS_COLUMN);
    }
    
    public String getProductName(int rowNumber) {

        return getCellData(
                FrameworkConstants.MULTIPLE_QUANTITY_SHEET,
                rowNumber,
                FrameworkConstants.PRODUCT_COLUMN);
    }

    public String getQuantity(int rowNumber) {

        return getCellData(
                FrameworkConstants.MULTIPLE_QUANTITY_SHEET,
                rowNumber,
                FrameworkConstants.QUANTITY_COLUMN);
    }

    public String getExpectedShippingCharge() {

        return getCellData(
                FrameworkConstants.SHIPPING_DATA_SHEET,
                FrameworkConstants.SHIPPING_CHARGE_ROW,
                FrameworkConstants.SHIPPING_CHARGE_COLUMN);
    }
    
    public void closeWorkbook() {

        try {

            workbook.close();

        } catch (IOException e) {

            throw new RuntimeException(
                    "Unable to close workbook.",
                    e);
        }
    }
}