package com.fullstackAI.LearningRestAPI.Service.impl;

import com.fullstackAI.LearningRestAPI.DTO.StudentDTO;
import com.fullstackAI.LearningRestAPI.Reposatory.studentRepo;
import com.fullstackAI.LearningRestAPI.Service.StudentService;
import com.fullstackAI.LearningRestAPI.entity.student;
//import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.*;
@Service
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService {

    private final studentRepo studentRepo;
    private final ModelMapper modelMapper;
    @Override
    public List<StudentDTO> getAllStudents() {
        List<student> students = studentRepo.findAll();
        return students.stream()
                .map(studentstd -> modelMapper.map(studentstd,StudentDTO.class))
                .toList();
    }

    @Override
    public StudentDTO getStudentById(Long id) {
         student studentstd = studentRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Student not found with ID"+id));
         return modelMapper.map(studentstd,StudentDTO.class);
    }


}
