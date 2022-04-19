/**
 * 
 */
package com.acc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.repository.db.AccountRepository;
import com.account.Account;

/**
 * @author Lenovo
 *
 */
@Service
public class AccountServiceImpl implements AccountService{

@Autowired
AccountRepository accountRepository;
    
    @Override
    public List<Account> getAccountList() {
	List<Account> account = null;
	try {
	    account = accountRepository.getAccountList();
	}catch(Exception e) {
	    e.getMessage();
	}
	return account;
    }

    @Override
    public void createAccount(Account account) {
	try {
	    accountRepository.createAccount(account);
	}catch(Exception e) {
	    e.getMessage();
	}
    }

}
