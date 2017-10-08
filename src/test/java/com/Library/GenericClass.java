package com.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class GenericClass {
	
	
	public static String configpath=BaseAutomation.sdripath+"\\config.properties";
	public static String getpropeties(String skey){
		String value="";
		Properties properties=new Properties();
		try{
		FileInputStream file=new FileInputStream(configpath);
		properties.load(file);
		value=properties.getProperty(skey);
	}catch(Exception e){
		e.printStackTrace();
	}
		return value;
	}

}
