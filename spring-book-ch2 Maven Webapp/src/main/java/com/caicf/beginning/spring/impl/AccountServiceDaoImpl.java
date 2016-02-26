package com.caicf.beginning.spring.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caicf.beginning.spring.dao.AccountDao;
import com.caicf.beginning.spring.entity.Account;
import com.caicf.beginning.spring.service.AccountService;

@Service
public class AccountServiceDaoImpl implements AccountService{

	private AccountDao accountDao;

	public AccountDao getAccountDao() {
		return accountDao;
	}
	
	@Autowired
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void transferMoney(int sourceAccountId, int targetAccountId,
			double amount) {
		Account sourceAccount=accountDao.find(sourceAccountId);
		Account targetAccount=accountDao.find(targetAccountId);
		sourceAccount.setBalance(sourceAccount.getBalance()-amount);
		targetAccount.setBalance(targetAccount.getBalance()+amount);
		accountDao.update(sourceAccount);
		accountDao.update(targetAccount);
	}

	public void depoistMoney(int accountId, double amount) throws Exception {
		Account account=accountDao.find(accountId);
		account.setBalance(account.getBalance()+amount);
		accountDao.update(account);
	}

	public Account getAccount(int id) {
		return accountDao.find(id);
	}
	
	
}
