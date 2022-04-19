/**
 * 
 */
package com.web.transform;

import java.util.List;

import com.dto.StudentDto;
import com.model.Student;

/**
 * @author Lenovo
 *
 */
public interface StudentWebService {
 public List<Student> transform(List<StudentDto> studentDto);
}
