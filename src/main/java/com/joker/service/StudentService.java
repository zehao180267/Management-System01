package com.joker.service;

import com.joker.bean.Student;

import java.util.List;

public interface StudentService {
    List<Student> showAllStudent();

    Student checkUser(String id,String password);

    int updateStudent(Student student);

    int deleteStudent(String id);
}
