/**
 * 
 */
package com.acc.service;

import java.util.List;

import com.account.Account;
import com.model.Student;

/**
 * @author Lenovo
 *
 */
public interface StudentService {
    
    /*
     * @param account the account
     */
    public void createStudent(List<Student> student);

    /*
     * @param deptId the deptId
     */
    public List<Student> getStudent(Long deptId);

}
