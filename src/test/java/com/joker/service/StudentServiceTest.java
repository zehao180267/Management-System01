package com.joker.service;

import com.joker.bean.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceTest {

    @Autowired
    StudentService studentService;

    @Test
    public void test01(){
        Student student = studentService.checkUser("1920170561", "123456");
        System.out.println(student);
    }
}
