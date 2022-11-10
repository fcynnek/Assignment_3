package com.fcynnek.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserPOJO {
// this class will read a file, parse, and store user information

		public BufferedReader fileReader () {
			
			BufferedReader fileReader = null;
			
			try {
				fileReader = new BufferedReader (new FileReader("data.txt"));
				
				String line;
				try {
					while ((line = fileReader.readLine()) != null) {
						System.out.println(line);
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
			
			
			return fileReader;
			
		}

}
