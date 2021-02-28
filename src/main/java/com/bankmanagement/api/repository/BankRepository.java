package com.bankmanagement.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankmanagement.api.entity.Account;

@Repository
public interface BankRepository extends JpaRepository<Account, Long> {
	
	Account findByCustomerId(Long customerId);

}
