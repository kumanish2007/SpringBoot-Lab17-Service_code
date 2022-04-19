/**
 * 
 */
package com.acc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.repository.db.AccountRepository;
import com.acc.repository.db.StudentRepository;
import com.account.Account;
import com.model.Student;

/**
 * @author Lenovo
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void createStudent(List<Student> student) {
	student.forEach(stu -> {
	    studentRepository.createStudent(stu);
	});

    }

    @Override
    public List<Student> getStudent(Long deptId) {
	
	List<Student> list = studentRepository.getStudent(deptId);
	return list;
    }

}
