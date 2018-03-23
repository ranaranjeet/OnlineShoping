package com.cusat.O_shoping.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
@Entity
@Table(name="Product_Details")

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6480738894237784741L;
	@NotNull
	@Column(name="product_id")
	private String productId;
	@NotNull
	@Column(name="seller_id")
	private String sellerId;
	@NotNull
	@Column(name="product_name")
	private String productName;
	@NotNull
	@Column(name="brand")
	private String brand;
	@NotNull
	@Column(name="style")
	private String style;
	@NotNull
	@Column(name="price")
	private BigDecimal price;
	@NotNull
	@Column(name="c_price")
	private BigDecimal costPrice;
	@NotNull
	@Column(name="sold_qty")
	private int soldQty;
	@NotNull
	@Column(name="avail_qty")
	private int availQty;
	@Temporal(TemporalType.TIMESTAMP)
	private String soldDate;
	@Temporal(TemporalType.TIMESTAMP)
	private String updateDate;
	private int active;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}
	public int getSoldQty() {
		return soldQty;
	}
	public void setSoldQty(int soldQty) {
		this.soldQty = soldQty;
	}
	public int getAvailQty() {
		return availQty;
	}
	public void setAvailQty(int availQty) {
		this.availQty = availQty;
	}
	public String getSoldDate() {
		return soldDate;
	}
	public void setSoldDate(String soldDate) {
		this.soldDate = soldDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
}
