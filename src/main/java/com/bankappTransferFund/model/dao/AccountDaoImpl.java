package com.bankappTransferFund.model.dao;

import java.util.HashMap;
import java.util.Map;

import com.bankappTransferFund.model.entities.Account;

public class AccountDaoImpl implements AccountDao{
	private Map<Integer, Account> accounts=new HashMap<>();
	private static int counter=0;
	 public AccountDaoImpl() {
		 accounts.put(++counter, new Account(counter, "raj", 5000));
		 accounts.put(++counter, new Account(counter, "ekta", 5000));	 
	}
	 
	 @Override
	public Account find(int id) {
		return accounts.get(id);
	}
	 
	 @Override
	public void update(Account account) {
		accounts.put(account.getId(), account);
	}
}
