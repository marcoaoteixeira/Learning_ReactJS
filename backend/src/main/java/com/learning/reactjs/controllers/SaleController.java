package com.learning.reactjs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.reactjs.dto.SaleDto;
import com.learning.reactjs.dto.SaleSuccessDto;
import com.learning.reactjs.dto.SaleSumDto;
import com.learning.reactjs.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable) {
		Page<SaleDto> result = service.findAll(pageable);
		
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDto>> amountGroupedBySeller() {
		List<SaleSumDto> result = service.amountGroupedBySeller();
		
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDto>> successGroupedBySeller() {
		List<SaleSuccessDto> result = service.successGroupedBySeller();
		
		return ResponseEntity.ok(result);
	}
}
