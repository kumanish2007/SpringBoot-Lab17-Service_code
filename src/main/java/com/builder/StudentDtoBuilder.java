/**
 * 
 */
package com.builder;

import com.dto.StudentDto;
import com.model.Student;

/**
 * @author Lenovo
 *
 */
public class StudentDtoBuilder {

   StudentDto studentDto; 
   
  public StudentDtoBuilder() {
      this.studentDto = studentDto;
   }
    
  public StudentDtoBuilder setSid(int sid) {
      this.studentDto.setSid(sid);
      return this;
  }
  
  public StudentDtoBuilder setFirstName(String firstname) {
      this.studentDto.setFirstName(firstname);
      return this;
  }
  
  public StudentDtoBuilder setLastName(String lastName) {
      this.studentDto.setLastName(lastName);
      return this;
  }
  
  public StudentDtoBuilder setEmail(String email) {
      this.studentDto.setEmail(email);
      return this;
  }
  
  public StudentDtoBuilder setAge(int age) {
      this.studentDto.setAge(age);
      return this;
  }
  
  public StudentDtoBuilder setPhone(long phone) {
      this.studentDto.setPhone(phone);
      return this;
  }
  
  public StudentDtoBuilder setDeptId(int deptId) {
      this.studentDto.setDeptId(deptId);
      return this;
  }
  
  public StudentDto build(){
	return new StudentDto();
}
}
