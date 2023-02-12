package com.example.StudentAndEvent.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {
    private Integer studentId;
    private String first_name;
    private String last_name;
    private Integer age;
    private String department;


}
