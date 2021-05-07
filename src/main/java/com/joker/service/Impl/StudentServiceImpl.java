package com.joker.service.Impl;

import com.joker.bean.Student;
import com.joker.dao.IStudent;
import com.joker.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private IStudent IStudent;

    @Override
    public List<Student> showAllStudent() {
        return IStudent.allStudents();
    }

    @Override
    public Student checkUser(String id, String password) {
        return IStudent.queryOne(id,password);
    }

    @Override
    @Transactional
    public int updateStudent(Student student) {
        return IStudent.updateOne(student);
    }

    @Override
    @Transactional
    public int deleteStudent(String id) {
        return IStudent.deleteOne(id);
    }
}
