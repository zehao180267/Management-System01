package com.joker.service.Impl;

import com.joker.bean.Course;
import com.joker.dao.ICourse;
import com.joker.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private ICourse ICourse;

    @Override
    public List<Course> showAll() {
        return ICourse.queryAll();
    }

    @Override
    @Transactional
    public int addCourse(Course course) {
        return ICourse.addOne(course);
    }

    @Override
    @Transactional
    public int updateCourse(Course course) {
        return 0;
    }

    @Override
    @Transactional
    public int deleteCourse(String id) {
        return 0;
    }
}
