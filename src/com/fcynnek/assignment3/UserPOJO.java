package com.fcynnek.assignment3;

public class UserPOJO {
// this class will store user information

	// calling UserService to bring over the parsed data
	UserService userService = new UserService();
	
	String parsedUsername = UserService.fileReader();
		System.out.println(parsedUsername);
	String parsedPassword = UserService.fileReader();
	String parsedName = UserService.fileReader();

	// storing the data from UserService class as private objects
	private String username;
	private String password;
	private String name;

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public void setUsername(String parsedUsername) {
		this.parsedUsername = username;
	}

	public void setPassword(String parsedPassword) {
		this.parsedPassword = password;
	}

	public void setName(String parsedName) {
		this.parsedName = name;
	}

}
