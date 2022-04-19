/**
 * 
 */
package com.acc.service;

import java.util.List;

import com.account.Account;

/**
 * @author Lenovo
 *
 */
public interface AccountService {
    public List<Account> getAccountList();
    
    /*
     * @param account the account
     */
    public void createAccount(Account account);
}
