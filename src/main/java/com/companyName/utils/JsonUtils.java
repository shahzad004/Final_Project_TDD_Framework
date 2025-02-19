package com.companyName.utils;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Properties;

public class JsonUtils {




    public static String readJsonFile(String fileName) throws IOException, URISyntaxException {

        URI filePath = Objects.requireNonNull(
                         JsonUtils.class.getClassLoader()
                        .getResource(fileName))
                          .toURI();


        System.out.println(filePath);
        return new String(Files.readAllBytes(Paths.get(filePath)));

    }




}
