/**
 * 
 */
package com.acc.repository.db;

import java.util.List;

import com.account.Account;
import com.model.Student;

/**
 * @author Lenovo
 *
 */
public interface StudentRepository {
    
    public void createStudent(Student student);
    
    public List<Student> getStudent(Long deptId);

}
