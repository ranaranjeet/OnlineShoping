package com.cusat.shoping.model;

public class ItemDetails {
	private String productId;
	private String sellerId;
	private String productName;
	private String brand;
	private String style;
	private float price;
	private float costPrice;
	private int soldQty;
	private int availQty;
	private String soldDate;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(float costPrice) {
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
