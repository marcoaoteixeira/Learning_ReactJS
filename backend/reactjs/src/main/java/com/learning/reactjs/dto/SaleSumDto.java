package com.learning.reactjs.dto;

import java.io.Serializable;

import com.learning.reactjs.entities.Seller;

public class SaleSumDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;
	
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public Double getSum() {
		return sum;
	}
	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	public SaleSumDto(Seller seller, Double sum) {
		sellerName = seller.getName();
		this.sum = sum;
	}

	
}