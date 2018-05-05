package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConfigurationManager {

	Logger log = Logger.getLogger("ConfigurationManager");
	Properties props;
	String configFileName;
	FileInputStream fis;
	
	public ConfigurationManager(String configFilePath)
	{
		configFileName = configFilePath;
	}
	
	public void loadProperty()
	{
		try {
		props = new Properties();
		fis = new FileInputStream(configFileName);
		
			props.load(fis);
		} catch (IOException e) {
			
		}
	}
	
	public String getProperty( String key)
	{
		String value ="";
		if(key!="")
		{
			loadProperty();
			value = props.getProperty(key);
		}
		return value;	
	}
}
