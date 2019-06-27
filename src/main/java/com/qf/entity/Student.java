package com.qf.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
@TableName("t_student")
public class Student implements Serializable {
    int id;
    String name;
    String score;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date birthday;
    int cid;
    @TableField(exist = false)
    Classes classes;

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Student(int id, String name, String score, Date birthday, int cid) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.birthday = birthday;
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score='" + score + '\'' +
                ", birthday=" + birthday +
                ", cid=" + cid +
                ", classes=" + classes +
                '}';
    }
}
