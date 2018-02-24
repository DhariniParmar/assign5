package com.example.cvct121.assign5.models;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by CVCT121 on 2/23/2018.
 */

@Database(name = MyDatabase.NAME, version = MyDatabase.VERSION)
public class MyDatabase {
    public static final String NAME = "MyDataBase";
    public static final int VERSION = 1;
}