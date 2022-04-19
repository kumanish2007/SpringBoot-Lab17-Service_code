/**
 * 
 */
package com.account;

import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * @author Lenovo
 *
 */
public abstract class AbstractCdmDatabase {
    
    @Autowired
   public NamedParameterJdbcTemplate jdbcTemplate;
    
   public static ResourceBundle RECORDS = ResourceBundle.getBundle("database");
    
    public static String getStringSql(String sql){
	if(sql != null) {
	    return RECORDS.getString(sql);
	}
	return null;
    }
}
