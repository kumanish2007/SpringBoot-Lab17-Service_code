/**
 * 
 */
package com.acc.repository.db;

import java.util.List;

import com.account.Account;

/**
 * @author Lenovo
 *
 */
public interface AccountRepository {
    
    public List<Account> getAccountList();
    
    public void createAccount(Account account);

}
