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
import com.acc.mapper.StudentMapper;
import com.account.AbstractCdmDatabase;
import com.account.Account;
import com.model.Student;

/**
 * @author Lenovo
 *
 */
@Repository
public class StudentRepositoryImpl extends AbstractCdmDatabase implements StudentRepository {

    @Override
    public void createStudent(Student student) {
	try {

	    MapSqlParameterSource param = new MapSqlParameterSource();
	    param.addValue("firstName", student.getFirstName());
	    param.addValue("lastName", student.getLastName());
	    param.addValue("email", student.getEmail());
	    param.addValue("phone", student.getPhone());
	    param.addValue("deptId", student.getDeptId());
	    param.addValue("age", student.getAge());

	    String sql = "insert into manish.student (firstName, lastName, Email, Phone, Age, DeptId) values(:firstName, :lastName, :email, :phone, :age, :deptId)";
	    jdbcTemplate.update(sql, param);
	    System.out.println("Inserted record in account table");
	} catch (Exception e) {
	    e.getMessage();
	    System.out.println("Exception message : " + e.getMessage());
	}
    }

    @Override
    public List<Student> getStudent(Long deptId) {
	 List<Student> list = null;
	try {
	    MapSqlParameterSource param = new MapSqlParameterSource();
	    param.addValue("deptId", deptId);
	   // String query1 = getStringSql("GET_STUDENT_LIST");
	    
	    String sql = "select Sid , firstName , LastName , Email , Phone , Age, DeptId from manish.student where DeptId = :deptId";
	    list = jdbcTemplate.query(sql, param, new StudentMapper());
	    System.out.println("Get list of student records");
	} catch (Exception e) {
	    e.getMessage();
	    System.out.println("Exception message : " + e.getMessage());
	}
	return list;
    }

}
