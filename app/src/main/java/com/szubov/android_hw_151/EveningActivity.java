package com.szubov.android_hw_151;

import android.os.Bundle;
import android.util.Log;

public class EveningActivity extends Synchronisation {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "EveningActivity -> onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);

        initViews();
    }
}