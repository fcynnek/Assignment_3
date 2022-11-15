package com.fcynnek.assignment3;

import java.util.Scanner;

public class UserLoginApplication {
// User validation with CSV File
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		UserService userData = new UserService();
		userData.loadUserData();
		
//		String testUsername = "kenny@email.com";
//		String testPassword = "Password1234";

		
//		userData.testPrint();
//		if (userData.doesUsernameExist(testUsername)) {
//			System.out.println("Yes");
//			System.out.println(userData.getPasswordFromUsername(testUsername));
//		} else {
//			System.out.println("No");
//		}
//		
//		if (userData.isGoodUserInput(testUsername, testPassword)) {
//			System.out.println("Match");
//		} else {
//			System.out.println("No match");
//		}

			
		
		System.out.println("Welcome to Assignment #3");
		
		scannerUsername(userInput);
		scannerPassword(userInput);
		
		int numberOfTries = 5;
		int i = 0;
		
		while (numberOfTries < 5) {
			scannerUsername(userInput);
			if (userData.doesUsernameExist(scannerUsername(userInput)) == true) {
				scannerPassword(userInput);
				if (userData.doesUsernameExist(scannerUsername(userInput)) == true) {
					if (userData.isGoodUserInput(scannerUsername(userInput), scannerPassword(userInput)) == false) {
						System.out.println("Invalid login, please try again");
						numberOfTries = numberOfTries - 1;
					} else {
						System.out.println("Welcome " + userData.storedUserPOJOs[i].getName());
						break;
					} 
				}
			}
		
			
		}
		if (numberOfTries == 0) {
			System.out.println("Too many failed login attempts, you are now locked out.");
		}
		userInput.close();
		
	}

	public static String scannerUsername (Scanner userInput) {
		System.out.println("Please enter your e-mail:");
		
		String userInputUsername = userInput.nextLine();
		
		return userInputUsername;
				
	}

	public static String scannerPassword (Scanner userInput) {
		System.out.println("Please enter your password:");
		
		String userInputPassword = userInput.nextLine();
		
		return userInputPassword;
		
	}
}
