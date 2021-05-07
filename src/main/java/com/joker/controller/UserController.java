package com.joker.controller;

import com.joker.bean.Course;
import com.joker.bean.Student;
import com.joker.bean.User;
import com.joker.service.CourseService;
import com.joker.service.StudentService;
import com.joker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @RequestMapping(value="/user/login")
    public String studentLogin(String id, String password, HttpServletRequest request) throws ServletException, IOException {

        User currentUser = userService.getUser(id, password);
        System.out.println(currentUser);
        if("".equals(currentUser)||currentUser==null) {
            System.out.println("用戶不存在或者密码错误");
            request.getSession().setAttribute("message", "用户名或密码错误");
            return "../../index.jsp";
        } else {
            System.out.println("登录成功");
            request.getSession().setAttribute("name",currentUser.getName());
            return "../../allData";
        }
    }

    @RequestMapping(value = "/allData")
    public String getAllData(HttpServletRequest request){
        List<Student> list = studentService.showAllStudent();
        for (Student student : list) {
            System.out.println(student);
        }
        request.getSession().setAttribute("students",list);
        return "../../pages/tables/data.jsp";
    }

    @RequestMapping(value = "/getData")
    public String getData(String studentId,HttpServletRequest request) throws UnsupportedEncodingException {

        Student student = studentService.checkUser(studentId, null);
        request.getSession().setAttribute("studentItem",student);
        System.out.println(student);
        return "../../pages/tables/update.jsp";
    }

    @RequestMapping(value = "/updateData")
    public String updateData(String id,String name, String password,String sex, String major,HttpServletRequest request) throws UnsupportedEncodingException {
        String ssex = sex;
        Student student = new Student(id, name, password, ssex, major);
        System.out.println(student);
        int i = studentService.updateStudent(student);
        if(i >0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        return "../../allData";
    }

    @RequestMapping(value = "/deleteData")
    public String deleteData(String id){
        int i = studentService.deleteStudent(id);
        if(i >0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        return "redirect:/allData";
    }

    @RequestMapping(value = "/getAllCourses")
    public String getAllCourses(HttpServletRequest request){
        List<Course> courses = courseService.showAll();
        for (Course course : courses) {
            System.out.println(course);
        }
        request.getSession().setAttribute("courses",courses);
        return "../../pages/tables/course.jsp";
    }

    @RequestMapping(value = "/addCourse")
    public String addCourse(String course,String week,String begin,String end,String major,String teacher){
        Course course1 = new Course(null,course, week, begin, end, major, teacher);
        int i = courseService.addCourse(course1);
        if(i >0){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
        return "redirect:/getAllCourses";
    }
}
