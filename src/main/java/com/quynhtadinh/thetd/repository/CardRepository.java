package com.quynhtadinh.thetd.repository;

import com.quynhtadinh.thetd.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findByCustomerId(Long customerId);
//    List<CreditCard> findByCustomerId(Long customerId);
//    List<CreditCard> findByCompanyId(Long companyId);
}
