package com.zmh.activitylifecycletest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(this.getClass().getSimpleName(), "Task id is " + getTaskId());
        setContentView(R.layout.activity_normal);
        findViewById(R.id.normal_start_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NormalActivity.this, StackMainActivity.class));
            }
        });
        findViewById(R.id.normal_start_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NormalActivity.this,DialogActivity.class));
            }
        });
    }
}
