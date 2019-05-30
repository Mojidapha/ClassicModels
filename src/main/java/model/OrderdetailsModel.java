package model;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;

import com.example.demo.entity.OrderDetailsId;

public class OrderdetailsModel {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private OrderDetailsId id;
	private Integer quantityOrdered;
	private BigDecimal priceEach;
	private Integer orderLineNumber;
    private String productCode;
	public OrderDetailsId getId() {
		return id;
	}
	public void setId(OrderDetailsId id) {
		this.id = id;
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
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
