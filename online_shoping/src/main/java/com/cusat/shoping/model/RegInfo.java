package com.cusat.shoping.model;

public class RegInfo {
private String Name;
private int phone;
private String email;
private String password;
private String confPassword;
public void setConfPassword(String confPassword) {
	this.confPassword = confPassword;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfPassword() {
	return confPassword;
}
}
