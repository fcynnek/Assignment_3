package com.fcynnek.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
// this class will validate the user input and compares against the info stored in UserPOJO class
// this class will also read a file, parse, and pass it to UserPOJO class

//	public static void fileReader() {
	public static void main(String[] args) {
	// this method reads the data.txt file and parse the data

		BufferedReader fileReader = null;

		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));

			String line;
			try {
				// reading each line as long as it is not null
				while ((line = fileReader.readLine()) != null) {
					System.out.println(line);

					// splitting each read line by the commas
					String[] parsedLine = line.split(",");
					System.out.println(parsedLine[0]);
					System.out.println(parsedLine[1]);
					System.out.println(parsedLine[2]);
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
	}

}
