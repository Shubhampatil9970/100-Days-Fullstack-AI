package com.fullstackAI.LearningRestAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String gender;
    private Long phoneNumber;
    private String qualification;
    private int age;
}
