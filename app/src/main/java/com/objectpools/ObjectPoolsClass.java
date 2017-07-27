package com.objectpools;

import android.support.v4.util.Pools;

/**
 * 对象池类
 * Created by Ray on 2017/7/26.
 */

public class ObjectPoolsClass {

    private static final int MAX_POOL_NUM = 10;

    private Pools.SynchronizedPool<Worker> pool;

    private volatile static ObjectPoolsClass poolsClass;

    private ObjectPoolsClass() {
        pool = new Pools.SynchronizedPool<>(MAX_POOL_NUM);
    }

    // 单例
    public static ObjectPoolsClass getInstance(){
        if(poolsClass == null){
            synchronized (ObjectPoolsClass.class){
                if(poolsClass == null){
                    poolsClass = new ObjectPoolsClass();
                }
            }
        }
        return poolsClass;
    }
    //获取当前对象池
    public Pools.SynchronizedPool<Worker> getPool() {
        return pool;
    }
    // 获取当前对象
    public static Worker getObject(){
        try {
            Worker worker = getInstance().getPool().acquire();
            return worker == null ? new Worker() : worker;
        }catch (Exception e){
            return new Worker();
        }
    }
    // 对象池中新增对象
    public static void releaseObject(Worker worker){
        try{
            getInstance().getPool().release(worker);
        }catch (Exception e){

        }
    }
}
