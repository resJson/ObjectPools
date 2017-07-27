package com.objectpools;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ObjectPoolsClass objectPoolsClass = ObjectPoolsClass.getInstance();
        objectPoolsClass.releaseObject(new Worker());
        objectPoolsClass.releaseObject(new Worker());
        objectPoolsClass.releaseObject(new Worker());
        Worker worker1 = objectPoolsClass.getObject();
        Worker worker2 = objectPoolsClass.getObject();
        Worker worker3 = objectPoolsClass.getObject();
    }
}
