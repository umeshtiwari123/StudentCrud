package com.cg.studentCrudSpringBootProject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.studentCrudSpringBootProject.dto.Student;
import com.cg.studentCrudSpringBootProject.repo.StudentRepository;

@Repository
public class StudentDao {

	@Autowired
	StudentRepository repository;
	
	public Student saveStudent(Student student)
	{
		return repository.save(student);
	}
	
	public Student getStudentById(int id)
	{
		return repository.findById(id).get();
	}
	
	public String updateStudent(Student student)
	{
		repository.save(student);
		return "Student Updated";
	}
	
	public String deleteStudentById(int id)
	{
		repository.deleteById(id);
		return "Deleted";
	}
	

}
