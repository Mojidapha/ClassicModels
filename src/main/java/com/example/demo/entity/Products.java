package com.example.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")

public class Products implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="productCode")
	private String productCode;
	@Column(name="productName")
	private String productName;
	@Column(name="productScale")
	private String productScale;
	@Column(name="productVendor")
	private String productVendor;
	@Column(name="productDescription")
	private String productDescription;
	@Column(name="quantityInStock")
	private Integer quantityInStock;
	@Column(name="buyPrice")
	private BigDecimal buyPrice;
	@Column(name="MSRP")
	private BigDecimal MSRP;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productLine")
    private Productlines productlines;

	public Productlines getProductlines() {
		return productlines;
	}

	public void setProductlines(Productlines productlines) {
		this.productlines = productlines;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(Integer quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public BigDecimal getMSRP() {
		return MSRP;
	}

	public void setMSRP(BigDecimal mSRP) {
		MSRP = mSRP;
	}

	/*public Orderdetails getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(Orderdetails orderdetails) {
		this.orderdetails = orderdetails;
	}*/
	
	
}
