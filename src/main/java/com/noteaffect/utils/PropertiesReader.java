package com.noteaffect.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	public static String readKey(String key) {
		
		Properties p;
		String user_dir =System.getProperty("user.dir");
		String file_path = user_dir + "/src/main/resources/data.properties";
		
		try {
			FileInputStream fileInputStream = new FileInputStream(file_path);
			p = new Properties();
			p.load(fileInputStream);
		} catch (IOException e) {
			throw new RuntimeException();
		}
		
		
		return p.getProperty(key);
	}
}
