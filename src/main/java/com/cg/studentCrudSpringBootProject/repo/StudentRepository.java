package com.cg.studentCrudSpringBootProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.studentCrudSpringBootProject.dto.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
