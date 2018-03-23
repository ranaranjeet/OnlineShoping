package com.cusat.O_shoping.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="User_Details")
public class UserInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4699648063035084265L;
	@NotNull
	@Column(name="user_name")
	private String userName;
	@NotNull
	@Column(name="gender")
	private String gender;
	
	@Temporal(TemporalType.DATE)
    @NotNull 
	@Column(updatable=false)
	private String dob;
	@NotNull
	@Column(name="contact")
	private String contact;
	@NotNull
	@Column(name="email")
	private String email;
	@NotNull
	@Column(name="address")
	private String address;
	private int active;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	
}
