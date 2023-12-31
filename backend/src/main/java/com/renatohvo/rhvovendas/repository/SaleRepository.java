package com.renatohvo.rhvovendas.repository;

import com.renatohvo.rhvovendas.dto.SaleSuccessDTO;
import com.renatohvo.rhvovendas.dto.SaleSumDTO;
import com.renatohvo.rhvovendas.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    @Query("SELECT new com.renatohvo.rhvovendas.dto.SaleSumDTO"
            + "(obj.seller, SUM(obj.amount)) "
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupBySeller();

    @Query("SELECT new com.renatohvo.rhvovendas.dto.SaleSuccessDTO"
            + "(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupBySeller();
}
