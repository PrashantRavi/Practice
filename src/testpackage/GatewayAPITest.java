package testpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;



// Sample test URL 

//http://enterprise.smsgupshup.com/GatewayAPI/rest?method=SendMessage&send_to=9199xxxxxxxx&msg=Welcome%20to%20SMS%20GupShup%20API&msg_type=TEXT&userid=20000xxxxx&auth_scheme=plain&password=password&v=1.1&format=text
//http://enterprise.smsgupshup.com/GatewayAPI/rest?method=sendMessage&userid=20000xxxxx&password=xxxxxx&msg=AIR2WEB%C3%8FmessageTue+Jun+21+15%3A51%3A22+IST+2016&send_to=9xxxxxxxxx&v=1.1&msg_type=TEXT&auth_scheme=PLAIN
public class GatewayAPITest {

	public static void main(String[] args) {
		try {
			Date mydate = new Date(System.currentTimeMillis());
			String data = "";
			data += "method=SendMessage";
			data += "&userid=20000xxxxx"; // your loginId
			data += "&password=" + URLEncoder.encode("xxxxxx", "UTF-8"); // yourpassword
																			
			data += "&msg=" + URLEncoder.encode("AIR2WEBÏmessage" + mydate.toString(), "UTF-8");
			data += "&send_to=" + URLEncoder.encode("9xxxxxxxxx", "UTF-8"); // a
																			// valid
																			// 10
																			// digit
																			// phone
																			// no.
			data += "&v=1.1";
			data += "&msg_type=TEXT"; // Can by "FLASH" or"UNICODE_TEXT" or
										// “BINARY”
			data += "&auth_scheme=PLAIN";

			//URL url = new URL("http://enterprise.smsgupshup.com/GatewayAPI/rest?" + data);
			String msg ="Failed : HomePageTest : verifyViewAllLinkInMDD() :- Verify collections tag on click of View All in MDD";
			String message="";
			for(int i=0;i<msg.length();i++){
				if(msg.charAt(i)==' '){
					message+="%20";
				}
				else
					message+=msg.charAt(i);
			}
			URL url=new URL("http://enterprise.smsgupshup.com/GatewayAPI/rest?method=sendMessage&msg="+message+"&msg_type=text&password=j2C74A&send_to=%2B918826054166,917503931626&userid=2000143219");
			System.out.println(url);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.connect();
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			StringBuffer buffer = new StringBuffer();
			while ((line = rd.readLine()) != null) {
				buffer.append(line).append("\n");
			}
			System.out.println(buffer.toString());
			rd.close();
			conn.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


}
