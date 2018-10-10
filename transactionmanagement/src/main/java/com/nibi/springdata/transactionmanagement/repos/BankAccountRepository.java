package com.nibi.springdata.transactionmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.nibi.springdata.transactionmanagement.entities.BankAccount;

public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {

}
