package com.learning.reactjs.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.reactjs.dto.SellerDto;
import com.learning.reactjs.entities.Seller;
import com.learning.reactjs.repository.SellerRepository;

@Service
public class SellerService  {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDto> findAll() {
		List<Seller> sellers = repository.findAll();
		return sellers.stream().map(x -> new SellerDto(x)).collect(Collectors.toList());
	}
}
