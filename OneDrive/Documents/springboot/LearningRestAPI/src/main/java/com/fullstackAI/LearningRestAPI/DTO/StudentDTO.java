package com.fullstackAI.LearningRestAPI.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor; // Added for flexibility
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private Long id;
    private String name;
    private String email;
    private String gender;
    private Long phoneNumber;
    private String qualification;
    private Integer age; // int is good for age



}