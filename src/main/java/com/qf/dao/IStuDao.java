package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStuDao extends BaseMapper<Student> {

}
