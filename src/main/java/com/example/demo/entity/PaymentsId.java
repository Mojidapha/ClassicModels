package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PaymentsId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "customerNumber")
    private Long customerNumber;
    @Column(name = "checkNumber")
    private String checkNumber;
 
    public PaymentsId() {
    }
 
    public PaymentsId(Long orderNumber, Long productCode) {
        this.customerNumber = customerNumber;
        this.checkNumber = checkNumber;
    }
 

	public Long getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PaymentsId)) return false;
        PaymentsId that = (PaymentsId) o;
        return Objects.equals(getCustomerNumber(), that.getCustomerNumber()) &&
                Objects.equals(getCheckNumber(), that.getCheckNumber());
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(getCustomerNumber(), getCheckNumber());
    }
	
}
