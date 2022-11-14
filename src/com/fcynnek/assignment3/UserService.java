package com.fcynnek.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.fcynnek.assignment3.UserPOJO;

public class UserService {
// this class will validate the user input and compares against the info stored in UserPOJO class
// this class will also read a file, parse, and pass it to UserPOJO class

	static final int numberOfLines = 5;

	UserPOJO[] storedUserPOJOs = new UserPOJO[numberOfLines];

	// this method reads the data.txt file and parse the data
	public String loadUserData() {

		BufferedReader fileReader = null;

		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));

			String line = "";

			int i = 0;

			try {
				// reading each line as long as it is not null
				while ((line = fileReader.readLine()) != null) {
					// System.out.println(line);

					// splitting each read line by the commas
					String[] parsedLine = line.split(",");
					String parsedUsername = parsedLine[0]; 	// storing parsed username
					String parsedPassword = parsedLine[1]; 	// storing parsed password
					String parsedName = parsedLine[2]; 		// storing parsed name

					UserPOJO currentUserPOJO = new UserPOJO(); 		// constructor
					currentUserPOJO.setUsername(parsedUsername); 	// constructing username object
					currentUserPOJO.setPassword(parsedPassword); 	// constructing password object
					currentUserPOJO.setName(parsedName); 			// constructing name object

					storedUserPOJOs[i] = currentUserPOJO; // storing object in arrays
					i = i + 1; // indexing the objects

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

	public void testPrint() {
		// practice
		int j = 0;

		while (j < numberOfLines) {
			System.out.println(storedUserPOJOs[j].getName());
			j++;
		}
		for (j = 0; j < numberOfLines; j++) {
			System.out.println(storedUserPOJOs[j].getUsername());
		}
	}

	public boolean doesUsernameExist(String username) {

		int i = 0;

		while (i < numberOfLines) {
			if (username.equals(storedUserPOJOs[i].getUsername())) {
				return true;
			}
			i = i + 1;
		}
		return false;
	}

	public String getPasswordFromUsername(String username) {

		int i = 0;

		while (i < numberOfLines) {
			if (username.equals(storedUserPOJOs[i].getUsername())) {
				return storedUserPOJOs[i].getPassword();
			}
			i = i + 1;
		}
		return null;
	}

	// validating values
	public boolean isGoodUserInput (String username, String password) {
		
			if (doesUsernameExist(username) == true) {
				getPasswordFromUsername(username);
				if (password.equals(getPasswordFromUsername(username))) {
					return true;
				}
			} return false;
		} 
}
