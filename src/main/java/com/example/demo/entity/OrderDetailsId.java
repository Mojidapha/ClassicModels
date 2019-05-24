package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDetailsId implements Serializable{
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "orderNumber")
    private Long orderNumber;
    @Column(name = "productCode")
    private Long productCode;
 
    public OrderDetailsId() {
    }
 
    public OrderDetailsId(Long orderNumber, Long productCode) {
        this.orderNumber = orderNumber;
        this.productCode = productCode;
    }
 
    public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getProductCode() {
		return productCode;
	}

	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDetailsId)) return false;
        OrderDetailsId that = (OrderDetailsId) o;
        return Objects.equals(getOrderNumber(), that.getOrderNumber()) &&
                Objects.equals(getProductCode(), that.getProductCode());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getOrderNumber(), getProductCode());
    }
	
}
