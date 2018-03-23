package com.cusat.O_shoping.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Login_Details")
public class LogInfo implements Serializable {
	
	private static final long serialVersionUID = 1062910885549752958L;
	
	@NotNull
	@Column(name="email")
	private String email;
	@NotNull
	@Column(name="Password")
	private String Password;
	@Temporal(TemporalType.TIMESTAMP)
	private String logInTime;
	@Temporal(TemporalType.TIMESTAMP)
	private String logOutTime;
	@Temporal(TemporalType.TIMESTAMP)
	private String duration;
	@NotNull
    @Column
	private String IPAddress;
	@NotNull
	@Column
	private int active;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getLogInTime() {
		return logInTime;
	}
	public void setLogInTime(String logInTime) {
		this.logInTime = logInTime;
	}
	public String getLogOutTime() {
		return logOutTime;
	}
	public void setLogOutTime(String logOutTime) {
		this.logOutTime = logOutTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
}
