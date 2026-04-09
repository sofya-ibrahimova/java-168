package mentor.lesson5;




import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class WriteToExcel {


    public static void writeCustomerToExcel(List<Customer> list) throws IOException, IllegalAccessException {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Customer Sheet");
            Field[] fields = Customer.class.getDeclaredFields();

            Row header = sheet.createRow(0); //строка в Excell
            int cellNum = 0;
            for (Field field : fields) {
                if (field.isAnnotationPresent(CustomAnno.class)) {
                    Cell cell = header.createCell(cellNum++); //ячейка внутри строки
                    cell.setCellValue(field.getName());
                }
            }
            int rowNum = 1;
            for (Customer customer : list) {
                Row row = sheet.createRow(rowNum++);
                cellNum = 0;
                Field[] fields1 = customer.getClass().getDeclaredFields();
                for (Field field : fields1) {
                    if (field.isAnnotationPresent(CustomAnno.class)) {
                        field.setAccessible(true);
                        Object o = field.get(customer);
                        row.createCell(cellNum++).setCellValue(o != null ? o.toString() : "");
                    }
                }
            }
                try (FileOutputStream fot = new FileOutputStream("customers.xlsx")){
                    workbook.write(fot);
                }
                System.out.println("Successfully created customers.xlsx");
            }
        }


}

