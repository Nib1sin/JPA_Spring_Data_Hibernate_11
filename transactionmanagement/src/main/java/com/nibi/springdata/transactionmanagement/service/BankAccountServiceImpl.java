package com.nibi.springdata.transactionmanagement.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nibi.springdata.transactionmanagement.entities.BankAccount;
import com.nibi.springdata.transactionmanagement.repos.BankAccountRepository;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	
	@Autowired
	BankAccountRepository repository;
	
	
	@Override
	public void transfer(int amount) {
		// TODO Auto-generated method stub
		
		BankAccount obamasAccount = repository.findById(1).get();
		obamasAccount.setBal(obamasAccount.getBal() - amount);
		repository.save(obamasAccount);
		
		
		BankAccount trumpsAccount = repository.findById(2).get();
		trumpsAccount.setBal(trumpsAccount.getBal() + amount);
		repository.save(trumpsAccount);
		

	}

}
