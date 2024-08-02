package com.codewithshubham.student_subject_management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithshubham.student_subject_management.Entity.Subject;
import com.codewithshubham.student_subject_management.repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	private SubjectRepository subjectRepository;

	public List<Subject> getAllSubjects() {
		return subjectRepository.findAll();
	}

	public Subject saveSubject(Subject subject) {

		return subjectRepository.save(subject);
	}
}
