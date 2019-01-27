package com.zmh.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(this.getClass().getSimpleName(), "Task id is " + getTaskId());
        setContentView(R.layout.activity_dialog);
    }
}
