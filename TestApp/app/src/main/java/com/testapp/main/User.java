package com.testapp.main;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey (autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "first_name")
    public String fname;

    @ColumnInfo(name = "last_name")
    public String lname;
}
