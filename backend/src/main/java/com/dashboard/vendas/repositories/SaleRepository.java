package com.dashboard.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dashboard.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}