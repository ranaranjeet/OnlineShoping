package com.cusat.O_shoping.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
@Entity
@Table(name= "Register_Details")
public class RegInfo implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1191885005728932350L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger userId;
	@NotNull
	@Column(name="U_Name")
	private String Name;
	
	@NotNull
	@Column(name="U_Phone")
	private int phone;
	@NotNull
	@Column(name="U_Email")
	private String email;
	@NotNull
	@Column(name="U_Password")
	private String password;
	@NotNull
	@Column(name="U_CPassword")
	private String confPassword;
	@Temporal(TemporalType.TIMESTAMP)
	private String acCreationDate;
	public BigInteger getUserId() {
		return userId;
	}
	public void setUserId(BigInteger userId) {
		this.userId = userId;
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
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}
	public String getAcCreationDate() {
		return acCreationDate;
	}
	public void setAcCreationDate(String acCreationDate) {
		this.acCreationDate = acCreationDate;
	}
}