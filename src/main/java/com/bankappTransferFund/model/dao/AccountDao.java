package com.bankappTransferFund.model.dao;

import com.bankappTransferFund.model.entities.Account;

public interface AccountDao {
	public void update(Account account);
	public Account find(int id);
}