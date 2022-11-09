package com.fcynnek.assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserPOJO {

//	private String username;
//	private String password;
//	private String name;

	BufferedReader fileReader = null;
	
	String line;
	
	try {
		
	}
	fileReader = new BufferedReader(new FileReader("data.txt"));
			
		while ((line = fileReader.readLine()) != null) {
			char[] line;
			System.out.println(line);
		}


}
