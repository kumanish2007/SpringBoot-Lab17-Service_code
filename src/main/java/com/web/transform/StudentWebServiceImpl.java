/**
 * 
 */
package com.web.transform;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.builder.StudentBuilder;
import com.dto.StudentDto;
import com.model.Student;

/**
 * @author Lenovo
 *
 */
@Service
public class StudentWebServiceImpl implements StudentWebService{

    @Override
    
    public List<Student> transform(List<StudentDto> studentDto) {

	return studentDto.stream().map(stuDto -> new StudentBuilder().
		withFirstName(stuDto.getFirstName()).
		withLastName(stuDto.getLastName()).
		withEmail(stuDto.getEmail()).
		withPhone(stuDto.getPhone()).
		withAge(stuDto.getAge()).
		withDeptId(stuDto.getDeptId()).
		build()).collect(Collectors.toList());
    }

}
