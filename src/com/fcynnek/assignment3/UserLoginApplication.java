package com.fcynnek.assignment3;

import java.util.Scanner;

public class UserLoginApplication {
// User validation with CSV File

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		UserService userData = new UserService();
		userData.loadUserData();

		System.out.println("Welcome to Assignment #3");

		int numberOfTries = 5;

		while (numberOfTries > 0) {
		
			String userInputUsername = scannerUsername(userInput);
			if (userData.isGoodUserInput(userInputUsername, scannerPassword(userInput)) == false) {
				numberOfTries = numberOfTries - 1;
				if (numberOfTries > 0) {
					System.out.println("Invalid login, please try again");
				}
			} else {
				System.out.println("Welcome " + userData.getName(userInputUsername));
				break;
			}
		}
		if (numberOfTries == 0) {
			System.out.println("Too many failed login attempts, you are now locked out.");
		}
		userInput.close();

	}

	public static String scannerUsername(Scanner userInput) {
		System.out.println("Please enter your e-mail:");

		String userInputUsername = userInput.nextLine();

		return userInputUsername.toLowerCase();

	}

	public static String scannerPassword(Scanner userInput) {
		System.out.println("Please enter your password:");

		String userInputPassword = userInput.nextLine();

		return userInputPassword;

	}
}
