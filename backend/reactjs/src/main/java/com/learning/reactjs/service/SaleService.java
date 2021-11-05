package com.learning.reactjs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.reactjs.dto.SaleDto;
import com.learning.reactjs.dto.SaleSuccessDto;
import com.learning.reactjs.dto.SaleSumDto;
import com.learning.reactjs.entities.Sale;
import com.learning.reactjs.repository.SaleRepository;
import com.learning.reactjs.repository.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDto> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		
		return result.map(x -> new SaleDto(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDto> amountGroupedBySeller() {
		sellerRepository.findAll();
		
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDto> successGroupedBySeller() {
		sellerRepository.findAll();
		
		return repository.successGroupedBySeller();
	}
}
