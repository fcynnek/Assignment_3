package com.fcynnek.assignment3;

import java.util.Scanner;

public class UserLoginApplication {
// User validation with CSV File
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Assignment #3");
		System.out.println("Please enter your e-mail:");
		
		Scanner userEmail = new Scanner(System.in);
		String username = userEmail.nextLine();
		
		System.out.println("Please enter your password:");
		
		Scanner userPassword = new Scanner(System.in);
		String password = userPassword.nextLine();
	}

}
