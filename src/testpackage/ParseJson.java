 /*package testpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//CommonTestData.json

public class ParseJson {
	public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        BufferedReader br = null;
 
        try {
        	String line;
			br = new BufferedReader(new FileReader("/Users/ravi.parshant/Documents/workspace/Practice/file1.txt"));
			while ((line = br.readLine()) != null) {
				 String linearr[] =line.split(":");
				System.out.println(linearr[1]);
			}
			
			

  
            Object obj = parser.parse(new FileReader(
                    "/Users/ravi.parshant/Documents/workspace/Practice/file1.txt"));
 
            JSONObject jsonObject = (JSONObject) obj;
            
            
 
            String name = (String) jsonObject.get(1);
            String author = (String) jsonObject.get("Author");
            JSONArray companyList = (JSONArray) jsonObject.get("Company List");
 
            System.out.println("Name: " + name);
            System.out.println("Author: " + author);
            System.out.println("\nCompany List:");
            
            Iterator<String> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}*/
