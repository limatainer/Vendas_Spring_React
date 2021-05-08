package com.dashboard.vendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dashboard.vendas.dto.SaleSuccessDTO;
import com.dashboard.vendas.dto.SaleSumDTO;
import com.dashboard.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	@Query("SELECT new com.dashboard.vendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();
	@Query("SELECT new com.dashboard.vendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}