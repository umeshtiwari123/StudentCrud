package com.cg.studentCrudSpringBootProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.studentCrudSpringBootProject.dao.StudentDao;
import com.cg.studentCrudSpringBootProject.dto.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao dao;
	
	public String saveStudent(Student student)
	{
		dao.saveStudent(student);
		return "Student Saved";
	}
	
	public Student getStudentById(int id)
	{
		Student stud1=dao.getStudentById(id);
		return  stud1;
	}
	
	public String updateStudent(Student student, int id)
	{
		Student stud2=dao.getStudentById(id);
		if(stud2!=null)
		{
			student.setId(id);
			return dao.updateStudent(student);

		}
		else
			return null;
	}
	
	public String deleteStudentById(int id)
	{
		return dao.deleteStudentById(id);
		
	}
}
