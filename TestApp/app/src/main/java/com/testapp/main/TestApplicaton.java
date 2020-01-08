package com.testapp.main;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.room.Room;

import javax.security.auth.login.LoginException;

import static android.content.ContentValues.TAG;

public class TestApplicaton extends Application {

    private static TestApplicaton context;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        context = this;
        Log.e(TAG, "attachBaseContext: call");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static AppDatabase getDB() {
        return Room.databaseBuilder(context, AppDatabase.class, "test.db").build();
    }
}
