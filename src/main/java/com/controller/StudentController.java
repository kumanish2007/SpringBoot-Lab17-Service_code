package com.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acc.service.AccountService;
import com.acc.service.StudentService;
import com.dto.StudentDto;
import com.model.Student;
import com.web.transform.StudentWebService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    Logger log = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    StudentService studentService;

    @Autowired
    StudentWebService studentWebService;

    @RequestMapping(value = "/createStudent", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createStudent(@RequestBody List<StudentDto> studentDto) {
	System.out.println("-----Create student-createStudent()------- ");

	List<Student> studentList = studentWebService.transform(studentDto);

	studentService.createStudent(studentList);
	System.out.println("Student Created : ");
	return new ResponseEntity<String>("Ok", HttpStatus.OK);
    }

    @RequestMapping(value = "/getStudentList/{deptId}", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getStudentList(@PathVariable Long deptId) {
	System.out.println("-----Create account-createAccount()------- ");

	List<Student> studentList = studentService.getStudent(deptId);
	System.out.println("get student list : " + studentList);
	return new ResponseEntity<List<Student>>(studentList, HttpStatus.OK);
    }

}
