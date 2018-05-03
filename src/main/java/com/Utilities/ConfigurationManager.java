package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConfigurationManager {

	Logger log = Logger.getLogger("ConfigurationManager");
	Properties props;
	FileInputStream fis;
	
	public void loadProperty(String file)
	{
		try {
		props = new Properties();
		fis = new FileInputStream(file);
		
			props.load(fis);
		} catch (IOException e) {
			
		}
	}
}
