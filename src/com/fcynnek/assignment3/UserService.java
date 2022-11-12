package com.fcynnek.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
// this class will validate the user input and compares against the info stored in UserPOJO class
// this class will also read a file, parse, and pass it to UserPOJO class

	// this method reads the data.txt file and parse the data
	public static String fileReader() {

		BufferedReader fileReader = null;

		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));

			String line = "";
			
			try {
				// reading each line as long as it is not null
				while ((line = fileReader.readLine()) != null) {
					System.out.println(line);

					// splitting each read line by the commas
					String[] parsedLine = line.split(",");
					String parsedUsername = parsedLine[0]; 	// storing parsed username
					String parsedPassword = parsedLine[1]; 	// storing parsed password
					String parsedName = parsedLine[2]; 		// storing parsed name
					System.out.println(parsedUsername);
					System.out.println(parsedPassword);
					System.out.println(parsedName);
					
				}
			} catch (IOException e) {
				System.out.println("I/O Exception ocurred");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(".txt File not found");
			e.printStackTrace();
		} finally {
			// closing the file reader
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return null;
		
	}
	
	// calling UserPOJO to bring over the stored data
	UserPOJO userPOJO = new UserPOJO();
	
	String storedUsername = userPOJO.getUsername();
	String storedPassword = userPOJO.getPassword();
	String storedName = userPOJO.getName();
	
	// calling main to bring over the user input for validation
	UserLoginApplication userInput = new UserLoginApplication();
	
	String userInputUsername = UserLoginApplication.getUsername();
	String userInputPassword = UserLoginApplication.getPassword();
	
	// validating values
	public static boolean isGoodUserInput(String storedUsername, String userInputUsername, String storedPassword, String userInputPassword) {
		if (storedUsername == userInputUsername && storedPassword == userInputPassword) {
			return true;
		} else {
			return false;
		}
	}
	
}
