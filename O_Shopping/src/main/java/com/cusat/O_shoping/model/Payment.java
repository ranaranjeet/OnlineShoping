package com.cusat.O_shoping.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="PayDetails")
public class Payment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1317409001913190791L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String paymentId;
	@NotNull
	@Column(name="product_id")
	private String productId;
	@NotNull
	@Column(name="userId")
	private String customerId;
	@NotNull
	@Column(name="amount")
	private BigDecimal amount;
	@Temporal(TemporalType.TIMESTAMP)
	private String paymentDate;
	@Temporal(TemporalType.TIMESTAMP)
	private String lastUpdate;
	
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
