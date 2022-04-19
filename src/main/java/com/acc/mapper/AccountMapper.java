/**
 * 
 */
package com.acc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.account.Account;

/**
 * @author Lenovo
 *
 */
public class AccountMapper implements RowMapper<Account>{

    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
	Account acc = new Account();
	acc.setAccno(rs.getInt("accno"));
	acc.setBal(rs.getLong("bal"));
	acc.setAtype(rs.getString("atype"));
	
	return acc;
    }

}
