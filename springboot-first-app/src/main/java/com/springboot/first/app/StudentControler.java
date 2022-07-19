package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControler {
	
	//http://localhost:8080/student
	@GetMapping("/admin")
	public Student getStudent() {
		return new Student("Dolendra", "Sharma");
	}
	
	//http://localhost:8080/students
		@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Shusma", "Gautam"));
		students.add(new Student("Hari", "Sharma"));
		students.add(new Student("Rita", "Sami"));
		students.add(new Student("Auror", "Karki"));
		students.add(new Student("Alisha", "Sapkota"));
		students.add(new Student("Addison", "Gurung"));
		students.add(new Student("Lalita", "Fagami"));
		students.add(new Student("Gobinde", "Paudel"));
		students.add(new Student("Sakshyam", "Joshi"));
		return students;
	}
		
		//http://localhost:8080/student/shusma/gautam
		
		@GetMapping("/student/{firstName}/{lastName}")
		public Student studentPathVariable(@PathVariable("firstName")String firstName, @PathVariable("lastName")String lastName) {
			return new Student(firstName,lastName);
		}
		
		
		//build rest API to handle query parameters
		//http://localhost/student/query?firstName=Shusma&lastName=gautam
		@GetMapping("/student/query")
		public Student studentQueryParam(
				@RequestParam(name = "firstName") String firstName,
				@RequestParam(name = "lastName") String lastName) {
			return new Student(firstName, lastName);
		}
				

}
