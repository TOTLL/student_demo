package com.qf.service.impl;

import com.qf.dao.IClassesDao;
import com.qf.entity.Classes;
import com.qf.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements IClassesService {
    @Autowired
    IClassesDao classesDao;

    @Override
    public Classes getInfoByStuId(Integer id) {
        return classesDao.selectById(id);
    }

    @Override
    public List<Classes> queryClasses() {
        return classesDao.selectList(null);
    }
}
