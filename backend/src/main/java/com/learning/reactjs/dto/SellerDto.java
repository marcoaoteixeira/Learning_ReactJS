package com.learning.reactjs.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.learning.reactjs.entities.Seller;

public class SellerDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	private List<SaleDto> sales = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SaleDto> getSales() {
		return sales;
	}
	
	public SellerDto() { }
	
	public SellerDto(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public SellerDto(Seller entity) {
		super();
		
		id = entity.getId();
		name = entity.getName();
	}
}
