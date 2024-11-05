package com.developerhut.inhutdev.entity;

public class User {

	private String username;

	private String password;

	private String role;
	
	private String[] screenPermission;

	private String firstName;
	
	private String lastName;
	
	private String lastLoginTime;
	

	public User(String username, String password, String role, String firstName, String lastName,
			String lastLoginTime) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastLoginTime = lastLoginTime;
		
		if("ADMIN".equals(this.role)) {
			this.setScreenPermission(new String[] {"USER", "POST"});
		} else if("USER".equals(this.role)) {
			this.setScreenPermission(new String[] {"POST"});
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String[] getScreenPermission() {
		return screenPermission;
	}

	public void setScreenPermission(String[] screenPermission) {
		this.screenPermission = screenPermission;
	}

}
