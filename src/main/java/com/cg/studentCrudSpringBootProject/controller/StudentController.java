package com.cg.studentCrudSpringBootProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.studentCrudSpringBootProject.dto.Student;
import com.cg.studentCrudSpringBootProject.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service; 
	
	@PostMapping("save")
	public String saveStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	
	@GetMapping("get")
	public Student getStudent(@RequestParam int id)
	{
		Student stud1=service.getStudentById(id);
		
		return stud1;
	
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		return service.deleteStudentById(id);
	}
	
	@PutMapping("update")
	public String updateStudent(@RequestBody Student student, @RequestParam int id)
	{
		Student stud2=service.getStudentById(id);
		if(stud2!=null)
		{
			student.setId(id);
			return service.updateStudent(student, id);
		}
		else return null;
	}
}
