package com.fcynnek.assignment3;

import java.util.Scanner;

public class UserLoginApplication {
// User validation with CSV File
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Assignment #3");
		getUsername();
		
		getPassword();
	}


	public static String getUsername() {
		System.out.println("Please enter your e-mail:");
		
		try (Scanner userEmail = new Scanner(System.in)) {
			String username = userEmail.nextLine();
		}
		return getUsername();
				
	}

	public static String getPassword() {
		System.out.println("Please enter your password:");
		
		try (Scanner userPassword = new Scanner(System.in)) {
			String password = userPassword.nextLine();
		}
		return getPassword();
		
	}
}
