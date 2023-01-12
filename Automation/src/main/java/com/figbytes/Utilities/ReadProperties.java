package com.figbytes.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class ReadProperties {
	
	public static String sep = System.getProperty("file.separator");

	public static Map<String, String> getEnvVar(String File) {
		Properties prop = new Properties();
		Map<String,String> propMap = new HashMap<String,String>();
		FileInputStream fis = null;
		try {
			Const.logger.info("Loading "+File);
			String filePATH = System.getProperty("user.dir") +sep+"src"+sep+"main"+sep+"java"+sep+"com"+sep+"figbytes"+sep+"Configuration"+sep+File;
			
			fis = new FileInputStream(filePATH);
			prop.load(fis);
			for(String key: prop.stringPropertyNames()){
				propMap.put(key, prop.getProperty(key));			
			}
		} catch (FileNotFoundException e) {
			Const.logger.info(e.getMessage());
		} catch (IOException e) {
			Const.logger.info(e.getMessage());
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}			
		return Collections.unmodifiableMap(propMap);	
	}
}
