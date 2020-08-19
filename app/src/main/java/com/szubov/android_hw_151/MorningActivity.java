package com.szubov.android_hw_151;

import android.os.Bundle;
import android.util.Log;

public class MorningActivity extends Synchronisation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "MorningActivity -> onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);

        initViews(MorningActivity.this);
    }
}