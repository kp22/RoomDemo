package com.testapp.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new insertTask().execute();
    }


    private class insertTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.e("tag", "onPreExecute: call");
        }

        @Override
        protected Void doInBackground(Void... voids) {
            User u = new User();
            int r = new Random().nextInt();
            u.fname = "F name " + r;
            r = new Random().nextInt();
            u.fname = "L name " + r;

            TestApplicaton.getDB().userDao().insertAll(u);
            Log.e("tag", "doInBackground: insert user");
            List<User> list = TestApplicaton.getDB().userDao().getAll();
            Log.e("tag", "doInBackground: use size:" + list.size());
            return null;
        }
    }
}
