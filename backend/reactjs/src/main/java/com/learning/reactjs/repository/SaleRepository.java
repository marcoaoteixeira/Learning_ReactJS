package com.learning.reactjs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.reactjs.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
