package com.bankmanagement.api.service;

import java.util.List;
import java.util.Optional;

import com.bankmanagement.api.entity.Account;

public interface IBankService {
	
	
	Account createAccount(Account account);
	List<Account> getAllAccounts();
	Account updateAccount(Long accountId, Account account);
	Account getAccountById(Long accountId);
	void deleteAccount(Long accountId);

}
