package all_in_one;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMail {
	public static void main(String[] args) {
		String name = "Abdul Shabeer R";
		String email = "abdulshabeer26@gmail.com";
		SendMail mail = new SendMail();
		try {
		mail.sendingMail(name, email);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void sendingMail(String name , String email) {
		 // Recipient's email ID needs to be mentioned.
	      String from = "shabeerjavatrainee@gmail.com";


	      Properties properties = System.getProperties();
//	  	host set
	  	properties.put("mail.smtp.host", "smtp.gmail.com");
	  	properties.put("mail.smtp.port", "465");
	  	properties.put("mail.smtp.ssl.enable", "true");
	  	properties.put("mail.smtp.auth", "true");

	      // Get the Session object.
	      Session session =Session.getInstance(properties, new Authenticator() {
	  		@Override
	  		protected PasswordAuthentication getPasswordAuthentication() {
	  			// TODO Auto-generated method stub
	  			return new PasswordAuthentication(from, "Shabeer@1234");
	  		}
	  	}); 
	    		

	      try {
	         Message message = new MimeMessage(session);
	         message.setFrom(new InternetAddress(from));
	         message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));

	         // Set Subject: header field
	         message.setSubject("Testing Subject");
	         BodyPart messageBodyPart = new MimeBodyPart();
	         messageBodyPart.setText("Dear "+name+"\n\n For Github Account Link \n https://github.com//abdulshabee// \n\n\n Thanks and Regards\nAbdul Shabeer R");
	         Multipart multipart = new MimeMultipart();

	         multipart.addBodyPart(messageBodyPart);
	         messageBodyPart = new MimeBodyPart();
	         String filename = "D:\\java\\HIT 2021 batch\\workspace\\module1_project\\certificate\\"+name+".pdf";
	         DataSource source = new FileDataSource(filename);
	         messageBodyPart.setDataHandler(new DataHandler(source));
	         messageBodyPart.setFileName(filename);
	         multipart.addBodyPart(messageBodyPart);
	         message.setContent(multipart);
	         // Send message
	         Transport.send(message);

	         System.out.println("\t Email sent Successfully..");
	  
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}
}
