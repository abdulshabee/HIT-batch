package all_in_one;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePdf {
	public static void main(String[] args) {
		String name = "Abdul Shabeer R";
		String otp = "1234";
		CreatePdf pdf = new CreatePdf();
		try {
			pdf.createPdf(name, otp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void createPdf(String name,String opt) throws Exception {
//		 String src="D:\\java\\HIT 2021 batch\\workspace\\module1_project\\image\\sample.pdf";
		 String src = "D:\\java\\HIT 2021 batch\\workspace\\module1_project\\certificate\\"+name+".pdf";
			Document document = new Document(PageSize.A4.rotate());
	        PdfWriter writer =PdfWriter.getInstance(document, new FileOutputStream(src));
	        writer.setEncryption("admin".getBytes(), opt.getBytes(), PdfWriter.ALLOW_COPY, PdfWriter.ENCRYPTION_AES_128);
	        writer.createXmpMetadata();
	        document.open();
	        Image img = Image.getInstance("D:\\java\\HIT 2021 batch\\workspace\\module1_project\\image\\certificate1.jpeg");
	        img.scaleToFit(850, 600);
	        img.setAbsolutePosition(20,-0);
	        document.add(img);
	        PdfContentByte canvas = writer.getDirectContent();
	        Font font = new Font(FontFamily.TIMES_ROMAN, 36, Font.BOLD, GrayColor.BLACK);
//	        name
	        Phrase phrase=new Phrase(name,font);
	        ColumnText.showTextAligned(canvas,Element.ALIGN_CENTER, phrase, 410,340, 0);
//	        date
	        Date d = new Date();  
			 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
			 String date = formatter.format(d); 
			 font.setSize(24);
			 Phrase date1=new Phrase(date,font);
			 ColumnText.showTextAligned(canvas,Element.ALIGN_CENTER, date1, 230,170, 0);
//			 signature
			 String sign = "Haarish Infotech";
			 Phrase sign1=new Phrase(sign,font);
			 ColumnText.showTextAligned(canvas,Element.ALIGN_CENTER, sign1, 585,170, 0);
//			 for
			 String for1 ="Outstanding Performance in Module 1";
			 Font font1 = new Font(FontFamily.TIMES_ROMAN,24, Font.BOLDITALIC, GrayColor.BLACK);
			 Phrase for2 = new Phrase(for1,font1);
			 ColumnText.showTextAligned(canvas,Element.ALIGN_CENTER,for2, 410,255, 0);
			 document.close();
	        System.out.println("\t create pdf successfully..");
	}
}
