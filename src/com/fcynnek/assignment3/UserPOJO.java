package com.fcynnek.assignment3;

public class UserPOJO {
// this class will store user information

	// storing the data from UserService class as private objects
	private String username;
	private String password;
	private String name;

	// getters
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}

	// setters
	public void setUsername(String parsedUsername) {
		this.username = parsedUsername;
	}
	public void setPassword(String parsedPassword) {
		this.password = parsedPassword;
	}
	public void setName(String parsedName) {
		this.name = parsedName;
	}

}
