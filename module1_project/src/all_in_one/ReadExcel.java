package all_in_one;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	static File file = new File("D:\\java\\HIT 2021 batch\\workspace\\module1_project\\details.xlsx");
	public static void main(String[] args) {
		CreatePdf pdf= new CreatePdf();
		SendSms sms= new SendSms();
		SendMail mail = new SendMail();
		ReadExcel excel =new ReadExcel(); 
		try {
			FileInputStream fis = new FileInputStream(file);
//			creating workbook
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			Iterator<Row>itr = sheet.iterator();
			int rownum =1;
			while(itr.hasNext()) {
				Row row = itr.next();
				if(row.getRowNum()==0) {
					continue;
				}
				if(row.getCell(0)!= null && row.getCell(1)!= null&&row.getCell(2)!= null) {
				Cell cell = row.getCell(0);
				String name =cell.getStringCellValue();
				cell = row.getCell(1);
				String email = cell.getStringCellValue();
				cell = row.getCell(2);
				String  number = cell.getStringCellValue();
				System.out.println("Start sending to : "+name);
				String otp= new DecimalFormat("000000").format(new Random().nextInt(999999));

				pdf.createPdf(name, otp);
				sms.SendingSms(name, otp, number);
				mail.sendingMail(name, email);
				excel.writeOtp(otp,name,rownum);
				rownum = rownum+1;

				}
	
			}
			wb.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void writeOtp(String otp ,String name , int rownum) throws Exception {
		FileInputStream fis = new FileInputStream(file);
//		creating workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(1);
		Row row =sheet.createRow(rownum);
		int cellnum = 0;
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(otp);
		cellnum ++;
		cell = row.createCell(cellnum);
		cell.setCellValue(name);
		rownum = rownum+1;
		FileOutputStream out = new FileOutputStream(("D:\\java\\HIT 2021 batch\\workspace\\module1_project\\details.xlsx"));
		wb.write(out);
		out.close();
		System.out.println("\t otp was saved in Excel..");
	}
}
