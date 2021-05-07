package com.joker.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String id;
    private String cName;
    private String week;
    private String begin;
    private String end;
    private String cMajor;
    private String cTeacher;
}
