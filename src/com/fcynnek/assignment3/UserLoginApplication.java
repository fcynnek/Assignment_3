package com.fcynnek.assignment3;

import java.util.Scanner;
import com.fcynnek.assignment3.UserService;
import com.fcynnek.assignment3.UserPOJO;

public class UserLoginApplication {
// User validation with CSV File
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		UserService userData = new UserService();
		userData.loadUserData();
//		userData.testPrint();
//		userData.isGoodUserInput("kenny@email.com", "Password123");
//		
//		String testUsername = "kenny@email.com";
//		
//		if (userData.doesUsernameExist(testUsername)) {
//			System.out.println("Yes");
//			System.out.println(userData.getPasswordFromUsername(testUsername));
//		} else {
//			System.out.println("No");
//		}
//		
//		if (userData.isGoodUserInput(testUsername, "Password1234")) {
//			System.out.println("Match");
//		} else {
//			System.out.println("No match");
//		}

			
		
		System.out.println("Welcome to Assignment #3");
		
		scannerUsername(userInput);
		scannerPassword(userInput);
		
		int numberOfTries = 5;
		
		int i = 0;
		
		while (numberOfTries < 0) {
			if (userData.isGoodUserInput(scannerUsername(userInput), scannerPassword(userInput)) == false) {
				System.out.println("Invalid login, please try again");
				numberOfTries = numberOfTries - 1;
			} else if (numberOfTries == 0) {
				System.out.println("Too many failed login attempts, you are now locked out.");
			} else {
				System.out.println("Welcome " + userData.storedUserPOJOs[i].getName());
			}
		}
		

		
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
