package org.springframework.model;

public class User {
	private String id;
	private String userName;
	public User() {
	}
	public User(String id, String userName) {
		this.id = id;
		this.userName = userName;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "com.clf.User{" +
				"id='" + this.id + '\'' +
				", userName='" + this.userName + '\'' +
				'}';
	}
}
