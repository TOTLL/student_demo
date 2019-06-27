package com.qf.service;

import com.qf.entity.Classes;

import java.util.List;

public interface IClassesService {
    public Classes getInfoByStuId(Integer id);

    List<Classes> queryClasses();
}
