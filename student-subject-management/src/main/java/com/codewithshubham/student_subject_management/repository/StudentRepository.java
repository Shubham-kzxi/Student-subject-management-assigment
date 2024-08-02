package com.codewithshubham.student_subject_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithshubham.student_subject_management.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
