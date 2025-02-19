package com.companyName.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

    private static final Properties properties = new Properties();

    static {

        try{
            InputStream input = PropertiesLoader.class
                    .getClassLoader()
                    .getResourceAsStream("application.properties");

            if(input == null) throw new RuntimeException("Application properties file not found under resources");
            properties.load(input);

        }catch(IOException e){
            throw new RuntimeException("Failed to Load Properties");
        }

    }

    public static String get(String key){
        return properties.getProperty(key);
    }

    public static String get(String key, String defaultValue){
        return properties.getProperty(key,defaultValue);
    }

    public static int getIntProperty(String key){
        return Integer.parseInt(properties.getProperty(key));
    }




}
