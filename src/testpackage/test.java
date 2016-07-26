package testpackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		
		
	
		Map<String,String> cont_dir = new HashMap<String,String>();
		cont_dir.put("Ravi", "8826054166");
		cont_dir.put("Kumar", "9971999659");
		cont_dir.put("Sonender","7503931626");
		cont_dir.put("Swati", "9650278293");
		cont_dir.put("Smita", "8010104824");
		cont_dir.put("Dhiraj", "9716036288");
		cont_dir.put("Ankit", "9413626266");
		
		Map<String,String> testcase_dir = new HashMap<String,String>();
		
		testcase_dir.put("BookingConfirmationPageTest", "Smita");
		testcase_dir.put("HomePageTest", "Smita");
		testcase_dir.put("HotelPageTest", "Smita");
		testcase_dir.put("ManageBookingPageTest", "Smita");
		testcase_dir.put("PaymentGatewayPageTest", "Smita");
		testcase_dir.put("Sanity", "Smita");
		testcase_dir.put("SearchPageTest", "Smita");
		
		
		String message= "HomePageTest_verifyViewAllLinkInMDD_Verify collections tag on click of View All in MDD";
		String [] messArr=message.split("_");
		
		System.out.println(cont_dir.get(testcase_dir.get("HomePageTest")));
		
		
	}

}
