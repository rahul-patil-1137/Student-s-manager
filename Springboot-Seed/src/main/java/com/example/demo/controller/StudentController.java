package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.excepation.ResourceNotFoundExcepation;
import com.example.demo.model.Student;
import com.example.demo.repository.studentRepository;




@RestController
@RequestMapping
@CrossOrigin("*")

public class StudentController {
	 
	
	@Autowired
	private studentRepository e;
	
	@GetMapping("/students")
	public List<Student> getallStudents()
	{
		return e.findAll();
		
	}
	
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student)
	{
		
		return e.save(student);
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentbyid(@PathVariable Long id)
	{
		Student student = e.findById(id).orElseThrow(()-> new ResourceNotFoundExcepation("Student not exist of this id "+id));
		
		return ResponseEntity.ok(student);
	}
	
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentDatails){
		

		Student student = e.findById(id).orElseThrow(()-> new ResourceNotFoundExcepation("Student not exist of this id "+id));
		
		
		student.setStudentName(studentDatails.getStudentName());
		student.setEmailId(studentDatails.getEmailId());
		student.setCourse(studentDatails.getCourse());
		student.setAddress(studentDatails.getAddress());
		student.setAddmission_status(studentDatails.getAddmission_status());
		student.setMobileNo(studentDatails.getMobileNo());
		Student updateStudent = e.save(student);
		return ResponseEntity.ok(updateStudent);
		
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity< Map<String,Boolean>> deleteStudent(@PathVariable Long id)
	{
				Student student = e.findById(id)
				.orElseThrow(()-> new ResourceNotFoundExcepation("Student not exist of this id "+id));

		
		e.delete(student);
		Map<String,Boolean> response = new HashMap<>();
		return ResponseEntity.ok(response);
	}

   
	
	
}


