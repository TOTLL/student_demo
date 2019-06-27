package com.qf.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@TableName("t_classes")
public class Classes implements Serializable {
    int id;
    String cname;
    int csum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCsum() {
        return csum;
    }

    public void setCsum(int csum) {
        this.csum = csum;
    }
}
