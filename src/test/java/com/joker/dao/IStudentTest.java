package com.joker.dao;

import com.joker.BaseTest;
import com.joker.bean.Student;
import com.joker.service.StudentService;
import com.joker.service.StudentServiceTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class IStudentTest extends BaseTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void test01(){
        for (Student student : studentService.showAllStudent()) {
            System.out.println(student);
        }
    }
}
