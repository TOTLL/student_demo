package com.qf.service;

import com.qf.entity.Student;

import java.util.List;

public interface IStuService {
    public List<Student> getList();

    void delete(Integer id);

    Student getId(int id);

    void insert(Student student);

    void update(Student student);
}
