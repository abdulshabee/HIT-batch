package all_in_one;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

public class SendSms {
	public void SendingSms(String name , String otp ,String number) {
		try {
		String message = "Dear "+name+", \n password is "+otp+" for opening the document.\n Do not share this with anyone";
		message = URLEncoder.encode(message , "UTF-8");
		String apiKey = "RzCtpNTqblB98duEXs5rwyegZjImfQDoM7V1HAv0kJGOUn43YLnESO1dFiDXTfGM4NIWhcQzmwusPYgK";
		String myUrl ="https://www.fast2sms.com/dev/bulkV2?authorization="+apiKey+"&sender_id=TXTIND"+"&message="+message+"&route=v3&numbers="+number;
		URL url = new URL(myUrl);
		HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
		
		con.setRequestMethod("GET");
		
		con.setRequestProperty("cache-control", "no-cache");
		int responseCode = con.getResponseCode();
		
		StringBuffer response=new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		
		while(true) {
			String line = br.readLine();
			
			if(line ==null) {
				break;
			}
			response.append(line);
		}
		System.out.println("\t Sms Sent Successfully..");
	}catch(Exception e) {e.printStackTrace();}
	}
}
