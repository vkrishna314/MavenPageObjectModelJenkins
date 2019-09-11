package com.parse.propertiesfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	 private static Properties properties;
	 public final static String propertyFilePath= ".//Configuration//EnvironmentDetails.properties";
	 
	 
	 public static boolean loadPropertiesFile(){
      boolean status = true;

	 try {
        File f=new File(propertyFilePath);
	 FileInputStream fis=new FileInputStream(f);
	     properties=new Properties();
	 properties.load(fis);
	 System.out.println("Properties File is loaded successfully");
	 
	 } 
	 catch (Exception e) {
		 status = false;
	   System.out.println("Properties File not found"+e.getMessage());
	 }
	return status;
	
}
	 
public static String getValue(String keyvalue )
	 {
	 String value = properties.getProperty(keyvalue);
	 if(value != null)
		 return value ;
	 else 
		 throw new RuntimeException(keyvalue+" not specified in the Configuration.properties file.");
	 
	 }
	 
		 

}



	
	 


