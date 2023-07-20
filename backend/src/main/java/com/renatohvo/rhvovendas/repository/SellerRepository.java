package com.renatohvo.rhvovendas.repository;

import com.renatohvo.rhvovendas.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
