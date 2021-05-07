package com.joker.bean;

public class Student {
    private String id;
    private String name;
    private String password;
    private String ssex;
    private String major;

    public Student() {
    }

    public Student(String id, String name, String password, String ssex, String major) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.ssex = ssex;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", ssex='" + ssex + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
