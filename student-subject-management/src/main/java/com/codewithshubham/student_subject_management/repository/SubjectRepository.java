package com.codewithshubham.student_subject_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithshubham.student_subject_management.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
