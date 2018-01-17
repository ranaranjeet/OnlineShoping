package com.cusat.shoping.model;

public class LogInfo {
	private String email;
	private String lastLog;
	private String logInTime;
	private String logOutTime;
	private String duration;
	private String IPAddress;
	private int active;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastLog() {
		return lastLog;
	}
	public void setLastLog(String lastLog) {
		this.lastLog = lastLog;
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
