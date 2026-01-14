package com.fullstackAI.LearningRestAPI.Service;

import com.fullstackAI.LearningRestAPI.DTO.StudentDTO;
import com.fullstackAI.LearningRestAPI.entity.student;

import java.util.List;

public interface StudentService {


    List<StudentDTO> getAllStudents();

    StudentDTO getStudentById(Long id);
}
