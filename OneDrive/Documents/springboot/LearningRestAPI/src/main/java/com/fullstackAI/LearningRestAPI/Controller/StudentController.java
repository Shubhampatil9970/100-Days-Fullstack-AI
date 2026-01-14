package com.fullstackAI.LearningRestAPI.Controller;

import com.fullstackAI.LearningRestAPI.DTO.StudentDTO;
import com.fullstackAI.LearningRestAPI.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/students")
    public List<StudentDTO> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);

    }
}
