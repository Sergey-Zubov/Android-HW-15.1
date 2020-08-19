package com.szubov.android_hw_151;

import android.os.Bundle;
import android.util.Log;

public class AfternoonActivity extends Synchronisation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "AfternoonActivity -> onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);

        initViews(AfternoonActivity.this);
    }
}