package com.objectpools;

import java.io.Serializable;

/**
 * Created by wanglei on 2017/7/27.
 */

public class Student implements Serializable {

    public Student(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String name;
    public int age;
    public boolean sex;

    @Override
    public String toString() {
        return name + "-" + age + "-" + (sex ? "男" : "女");
    }
}
