package com.example.demo.entity;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")

public class Orderdetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderNumber;
	private String productCode;
	private Integer quantityOrdered;
	private BigDecimal priceEach;
	private Integer orderLineNumber;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderNumber")
    private Orders orders;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productCode")
    private Products products;
	
	public Integer getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public Integer getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(Integer quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public BigDecimal getPriceEach() {
		return priceEach;
	}
	public void setPriceEach(BigDecimal priceEach) {
		this.priceEach = priceEach;
	}
	public Integer getOrderLineNumber() {
		return orderLineNumber;
	}
	public void setOrderLineNumber(Integer orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

}
