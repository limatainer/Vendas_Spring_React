package com.dashboard.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dashboard.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}