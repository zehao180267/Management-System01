package com.joker.dao;

import com.joker.bean.Course;

import java.util.List;

public interface ICourse {
    List<Course> queryAll();
    int addOne(Course course);
    int updateOne(Course course);
    int deleteOne(String id);
}
