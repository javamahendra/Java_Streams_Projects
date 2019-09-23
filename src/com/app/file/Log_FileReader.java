package com.app.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import javax.print.attribute.standard.Finishings;

public class Log_FileReader {

	public static final String FILENAME="C:\\Users\\sh\\Desktop\\Angular-8 Notes.txt";
	
	public static void main(String[] args) {
		
		
		StringBuilder logContent=new StringBuilder();
		try {
			Files.lines(Paths.get(FILENAME)).forEach(logContent::append);
			System.out.println(logContent);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
