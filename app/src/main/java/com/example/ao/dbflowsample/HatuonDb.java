package com.example.ao.dbflowsample;

import com.raizlabs.android.dbflow.annotation.Database;

@Database(name = HatuonDb.NAME, version = HatuonDb.VERSION, generatedClassSeparator = "_")
public class HatuonDb {
    public static final String NAME = "pronunce";
    public static final int VERSION = 1;

}