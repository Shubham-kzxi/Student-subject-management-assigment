package com.codewithshubham.student_subject_management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithshubham.student_subject_management.Entity.Subject;
import com.codewithshubham.student_subject_management.Service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    
    @GetMapping
    public ResponseEntity<List<Subject>> getAllSubjects() {
        List<Subject> subjects = subjectService.getAllSubjects();
        return ResponseEntity.ok(subjects);
    }
    @PostMapping
    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject) {
    	
       Subject savedSubject = subjectService.saveSubject(subject);
     
        return ResponseEntity.ok(savedSubject);
    }
    
 
}

