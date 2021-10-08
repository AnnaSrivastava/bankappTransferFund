package com.bankappTransferFund.model.service;

import com.bankappTransferFund.model.entities.Account;

public interface AccountService {
	public void transfer(int from, int to, int amout);
	public void deposit(int id, double amount);
	public Account getAccount(int id);
}
