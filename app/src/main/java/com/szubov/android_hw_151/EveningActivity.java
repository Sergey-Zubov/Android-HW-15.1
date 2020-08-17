package com.szubov.android_hw_151;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class EveningActivity extends AppCompatActivity {

    private static final String CURRENT_DATE = "currentDate";
    private static final String LOG_TAG = "My app";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);

        findViewById(R.id.btnStartSynchronisation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LOG_TAG, "EveningActivity -> btnStartSynchronisation -> onClick");
                Toast.makeText(EveningActivity.this, R.string.data_syncing_has_started,
                        Toast.LENGTH_LONG).show();
                Toast.makeText(EveningActivity.this,
                        R.string.synchronization_is_completed_successfully,
                        Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Log.d(LOG_TAG, "EveningActivity -> btnStartSynchronisation -> " +
                                "onClick -> Handler().postDelayed -> finish()");
                        finish();
                    }
                }, 4000);
            }
        });

        TextView textView = findViewById(R.id.textViewCurrentTime);
        textView.setText(getIntent().getStringExtra(CURRENT_DATE));

    }
}