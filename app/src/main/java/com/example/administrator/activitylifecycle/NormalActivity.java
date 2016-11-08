package com.example.administrator.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2016/11/8.
 */

public class NormalActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
    }
}
