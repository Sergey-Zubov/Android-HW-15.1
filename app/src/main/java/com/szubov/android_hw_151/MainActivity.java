package com.szubov.android_hw_151;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import java.time.LocalTime;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        final int time1 = 6;
        final int time2 = 14;
        final int time3 = 15;

        findViewById(R.id.btnSynchronization).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SYNC);
                int timeNow = LocalTime.now().getHour();


                if (timeNow >= time1 && timeNow < time2) {
                    intent.setData(Uri.parse("http://morning"));
                } else if (timeNow >= time2 && timeNow < time3) {
                    intent.setData(Uri.parse("http://afternoon"));
                } else {
                    intent.setData(Uri.parse("http://evening"));
                }
            }
        });
    }
}