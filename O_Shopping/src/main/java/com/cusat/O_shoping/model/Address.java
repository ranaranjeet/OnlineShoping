package com.cusat.O_shoping.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "address")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6290278503497775748L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	BigInteger userId;
	
	@NotNull
	@Column(name = "house_number")
	String housenumber;
	
	@NotNull
	@Column(name = "street")
	String street;
	
	@NotNull
	@Column(name = "landmark")
	String landmark;
	
	@NotNull
	@Column(name = "city")
	String city;
	
	@NotNull
	@Column(name = "state")
	String state;
	
	@NotNull
	@Column(name = "pin")
	String pin;
}
