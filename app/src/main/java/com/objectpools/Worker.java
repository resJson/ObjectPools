package com.objectpools;

import java.io.Serializable;

/**
 *
 * Created by Ray on 2017/7/26.
 */

public class Worker implements Serializable {


    public String name;
    public int age;
    public boolean sex;

    @Override
    public String toString() {
        return name + "-" + age + "-" + (sex?"男":"女");
    }
}
