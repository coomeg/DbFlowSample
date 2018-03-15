package com.example.ao.dbflowsample;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = HatuonDb.class, name="T_WORD")
public class Word extends BaseModel {
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public String word;
    @Column
    public String type;
    @Column
    public String kigou;
    @Column
    public int ngCount;
    @Column
    public int okCount;
    @Column
    public int average;
    @Column
    public String japanese;

    @Column
    public long createdTimeMillis;
}