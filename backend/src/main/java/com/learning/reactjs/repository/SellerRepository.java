package com.learning.reactjs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.reactjs.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
