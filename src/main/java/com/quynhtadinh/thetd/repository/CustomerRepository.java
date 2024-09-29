package com.quynhtadinh.thetd.repository;

import com.quynhtadinh.thetd.entity.Card;
import com.quynhtadinh.thetd.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
