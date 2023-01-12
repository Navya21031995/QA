package com.figbytes.Utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailUtils {
	
	public static String date;
	public static String sep = System.getProperty("file.separator");

	public static void sendHTMLReportByGMail(String from, String pass, String to, String subject, String body) {

		 Properties props = new Properties();
	     
	     

		String host = "smtp.gmail.com";

		props.put("mail.smtp.starttls.enable", "true");
		props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");

		props.put("mail.smtp.host", "host");

		props.put("mail.smtp.user", from);

		props.put("mail.smtp.password", pass);

		props.put("mail.smtp.port", "587");

		props.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props);

		MimeMessage message = new MimeMessage(session);

		try {

			// Set from address

			message.setFrom(new InternetAddress(from));

			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set subject

			message.setSubject(subject);

			message.setText(body);

			BodyPart objMessageBodyPart = new MimeBodyPart();

			objMessageBodyPart.setText("Please Find The Attached Report File!");

			Multipart multipart = new MimeMultipart();

			multipart.addBodyPart(objMessageBodyPart);

			objMessageBodyPart = new MimeBodyPart();

			// Set path to the pdf report file
			//String filename = "C:/Users/vaishali.chaudhary/eclipse-workspace/FigbytesProject/src/main/java/com/figbytes/Reports/14-02-2022__02_40_24.html";
				
	//		String filename = System.getProperty("user.dir") + separator+"src"+"main"+separator+"java"+separator+"com"+separator+"figbytes"+separator+"Reports"+separator+date+".html";

			//Get dynamic extent report name by local repository
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy__hh_mm_ssaa");
			date = df.format(new Date());
		//	String filename = Const.Extent_Report_Path+sep+date+".html";
			
			//Send TestNG emailable report by email
			String filename = System.getProperty("user.dir") + sep+"test-output"+sep+"emailable-report.html";
			Const.logger.info(filename);
			//System.out.println("filename");
			
			// Create data source to attach the file in mail

			DataSource source = new FileDataSource(filename);

			objMessageBodyPart.setDataHandler(new DataHandler(source));

			objMessageBodyPart.setFileName(filename);

			multipart.addBodyPart(objMessageBodyPart);

			message.setContent(multipart);

			Transport transport = session.getTransport("smtp");

			transport.connect(host, from, pass);

			transport.sendMessage(message, message.getAllRecipients());
			Const.logger.info("<><><><>Email Sent<><><><>");

			transport.close();

		}

		catch (AddressException ae) {

			ae.printStackTrace();

		}

		catch (MessagingException me) {

			me.printStackTrace();

		}

	}
}