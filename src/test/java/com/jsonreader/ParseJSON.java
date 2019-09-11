package com.jsonreader;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.listners.Listners;
import com.relevantcodes.extentreports.ExtentReports;
import com.reporting.ExtentReport;

public class ParseJSON extends ExtentReport{

	public static JSONParser parser;
	public static JSONObject jsonObject;

	public static void parseJSONfile() {
		parser = new JSONParser();
		try {
			System.out.println("Json File is getting loaded......");
			Object object = parser.parse(new FileReader("./JsonTestData/Testdata.json"));

			// convert Object to JSONObject
			jsonObject = (JSONObject) object;
			
			System.out.println("Json File is loaded sucessfully !!!");

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getData(String arrayname, String data)

	{
		String jsondata = "";
		try {
			// Reading the array
			JSONArray arr = (JSONArray) jsonObject.get(arrayname);

			for (int i = 0; i <= arr.size() - 1; i++)

			{
				JSONObject item = (JSONObject) arr.get(i);

				String crnttestcase = (String) item.get("TestCase_Name");
				
				System.out.println(crnttestcase);
				System.out.println(Listners.crntTestCaseName);

				if (crnttestcase.equalsIgnoreCase(Listners.crntTestCaseName)) {

					jsondata = (String) item.get(data);

					System.out.println(jsondata);

					break;

				}

			}

		}

		catch (Exception e) {
			System.out.println("Unable to get the data for the field " + data);
		}
		return jsondata;

	}
	
	public static String getURL(String Environment,String data)

	{
		String jsondata = "";
		try {
			// Reading the array
			JSONArray arr = (JSONArray) jsonObject.get("GenericData");

			for (int i = 0; i <= arr.size() - 1; i++)

			{
				JSONObject item = (JSONObject) arr.get(i);

				String env = (String) item.get("Environment");

				if (env.equalsIgnoreCase(Environment)) {

					jsondata = (String) item.get(data);

					System.out.println(jsondata);

					break;

				}

			}

		}

		catch (Exception e) {
			System.out.println("Unable to get the data for the field " + data);
		}
		return jsondata;

	}
	
	
	
	

}
