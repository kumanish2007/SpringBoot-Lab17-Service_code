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
public class StudentBuilder {

   private Student student; 
   
  public StudentBuilder() {
      this.student = new Student();
   }
    
  public StudentBuilder withSid(int sid) {
      this.student.setSid(sid);
      return this;
  }
  
  public StudentBuilder withFirstName(String firstname) {
      this.student.setFirstName(firstname);
      return this;
  }
  
  public StudentBuilder withLastName(String lastName) {
      this.student.setLastName(lastName);
      return this;
  }
  
  public StudentBuilder withEmail(String email) {
      this.student.setEmail(email);
      return this;
  }
  
  public StudentBuilder withAge(int age) {
      this.student.setAge(age);
      return this;
  }
  
  public StudentBuilder withPhone(long phone) {
      this.student.setPhone(phone);
      return this;
  }
  
  public StudentBuilder withDeptId(int deptId) {
      this.student.setDeptId(deptId);
      return this;
  }
  
  public Student build(){
	return student;
}
}
