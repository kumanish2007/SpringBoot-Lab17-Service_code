/**
 * 
 */
package com.acc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.account.Account;
import com.model.Student;

/**
 * @author Lenovo
 *
 */
public class StudentMapper implements RowMapper<Student>{

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	Student student = new Student();
	student.setSid(rs.getInt("Sid"));
	student.setFirstName(rs.getString("firstName"));
	student.setLastName(rs.getString("LastName"));
	student.setEmail(rs.getString("Email"));
	student.setPhone(rs.getLong("Phone"));
	student.setAge(rs.getInt("Age"));
	student.setDeptId(rs.getInt("DeptId"));
	return student;
    }

}
