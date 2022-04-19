/**
 * 
 */
package com.acc.repository.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.acc.mapper.AccountMapper;
import com.account.AbstractCdmDatabase;
import com.account.Account;

/**
 * @author Lenovo
 *
 */
@Repository
public class AccountRepositoryImpl extends AbstractCdmDatabase implements AccountRepository{

    @Override
    public List<Account> getAccountList() {
	List<Account> accList = null;
	try {
	    String sql = "select accno , bal , atype from manish.account";
	    MapSqlParameterSource param = new MapSqlParameterSource();
	    accList = jdbcTemplate.query(sql, param, new AccountMapper());
	    
	}catch(Exception e) {
	    e.getMessage();
	}
	
	return accList;
    }

    @Override
    public void createAccount(Account acc) {
	try {
	    
	    MapSqlParameterSource param = new MapSqlParameterSource();
	    param.addValue("accno", acc.getAccno());
	    param.addValue("bal", acc.getBal());
	    param.addValue("atype", acc.getAtype());
	    
	    String sql = "insert into manish.account (accno, bal, atype) values(:accno, :bal, :atype)";
	    jdbcTemplate.update(sql, param);
	    System.out.println("Inserted record in account table");
	}catch(Exception e) {
	    e.getMessage();
	    System.out.println("Exception message : "+ e.getMessage());
	}
    }

}
