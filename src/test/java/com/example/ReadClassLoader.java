package com.example;

public class ReadClassLoader {
 static java.net.URL resource = ReadClassLoader.class.getClassLoader()
 .getResource("");
}