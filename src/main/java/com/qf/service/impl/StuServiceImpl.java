package com.qf.service.impl;

import com.qf.dao.IClassesDao;
import com.qf.dao.IStuDao;
import com.qf.entity.Classes;
import com.qf.entity.Student;
import com.qf.service.IClassesService;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    IStuDao stuDao;

    @Autowired
    IClassesService classesService;

    @Override
    public List<Student> getList() {
        List<Student> list = stuDao.selectList(null);
        for (Student student : list) {
            Classes infoByStuId = classesService.getInfoByStuId(student.getCid());
            student.setClasses(infoByStuId);
        }
        return list;
    }

    @Override
    public void delete(Integer id) {
        stuDao.deleteById(id);
    }

    @Override
    public Student getId(int id) {
        return stuDao.selectById(id);
    }

    @Override
    public void insert(Student student) {
        stuDao.insert(student);
    }

    @Override
    public void update(Student student) {
        stuDao.updateById(student);
    }
}
