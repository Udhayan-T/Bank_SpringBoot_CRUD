package com.bankmanagement.api.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankmanagement.api.entity.Account;
import com.bankmanagement.api.repository.BankRepository;

@Service
public class BankService implements IBankService {

	@Autowired
	private BankRepository bankRepository;

	@Override
	public Account createAccount(Account account) {
		return bankRepository.save(account);
	}

	@Override
	public List<Account> getAllAccounts() {
		return bankRepository.findAll();
	}

	@Override
	public Account updateAccount(Long accountId, Account account) {

		Account account1 = bankRepository.findByCustomerId(accountId);
		
		account1.setCustomerId(account.getCustomerId());
		account1.setName(account.getName());
		account1.setAccountNumber(account.getAccountNumber());
		account1.setCountry(account.getCountry());
		account1.setState(account.getState());
		account1.setGender(account.getGender());
		account1.setDob(account.getDob());
		account1.setRegistrationDate(account.getRegistrationDate());
		account1.setBankName(account.getBankName());
		account1.setBranchName(account.getBranchName());
		return bankRepository.save(account1);

	}
	
	private Account convertToDto(Account account) {
		ModelMapper modelMapper = new ModelMapper();
	    Account acc = modelMapper.map(account, Account.class);
	    return acc;
	}

	@Override
	public Account getAccountById(Long accountId) {
		return bankRepository.findByCustomerId(accountId);
	}

	@Override
	public void deleteAccount(Long accountId) {
		/*Account account = bankRepository.findById(accountId).get();

		if (account != null) {
			bankRepository.delete(account);
			return true;
		}
		return false;*/
		
		Account account = bankRepository.findByCustomerId(accountId);
		
		bankRepository.delete(account);
		
	}

}
