package com.joker.dao;

import com.joker.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IStudent {
    List<Student> allStudents();
    Student queryOne(@Param("id") String id, @Param("password") String password);
    int updateOne(Student student);
    int deleteOne(String id);
}
