package com.joker.service;

import com.joker.bean.Course;

import java.util.List;

public interface CourseService {
    List<Course> showAll();
    int addCourse(Course course);
    int updateCourse(Course course);
    int deleteCourse(String id);
}
