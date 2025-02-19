package com.companyName.config;

public class ApplicationConfig {

    public static final String  APP_NAME = "TDD FRAMEWORK";
    public static final String APP_VERSION= "1.0.0";


    public static final  String ENV= System.getProperty("env","dev");
    public static final  String BASE_URL = ENV.equals("dev") ?
            System.getProperty("base.url")
            : "https://monday.com";

    public  static  final boolean ENABLE_DEBUG_LOGGING= ENV.equals("dev");



}
