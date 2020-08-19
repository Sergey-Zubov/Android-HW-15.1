package com.szubov.android_hw_151;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    protected static final String CURRENT_DATE = "currentDate";
    protected static final String LOG_TAG = "My app";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        Log.d(LOG_TAG, "MainActivity -> initViews");
        final int time1 = 6;
        final int time2 = 14;
        final int time3 = 15;

        findViewById(R.id.btnSynchronization).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LOG_TAG, "MainActivity -> initViews ->btnSynchronisation -> onClick");
                Intent intent = new Intent(Intent.ACTION_SYNC);
                Date currentDate = new Date();
                int hours = currentDate.getHours();

                if (hours >= time1 && hours < time2) {
                    intent.setData(Uri.parse("http://morning"));
                } else if (hours >= time2 && hours < time3) {
                    intent.setData(Uri.parse("http://afternoon"));
                } else {
                    intent.setData(Uri.parse("http://evening"));
                }
                intent.putExtra(CURRENT_DATE, currentDate.toString());
                startActivity(intent);
            }
        });
    }
}