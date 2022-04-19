/**
 * 
 */
package rest.template;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.model.Student;

/**
 * @author Lenovo
 *
 */
public class ClientRestTemplate {
    private static final String url = "http://localhost:12345/student/getStudentList/12345";
public static void main(String[] args) {
    
    RestTemplate restTemplate = new RestTemplate();
    List<Student> student = (List<Student>) restTemplate.getForObject(url, Student.class);
    System.out.println(student);
}
}
