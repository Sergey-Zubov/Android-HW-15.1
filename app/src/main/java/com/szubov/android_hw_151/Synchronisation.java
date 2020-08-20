package com.szubov.android_hw_151;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Synchronisation extends MainActivity {
    protected Button mBtnStartSynchronisation;
    protected TextView mTextViewCurrentTime;

    protected void initViews() {
        mBtnStartSynchronisation = findViewById(R.id.btnStartSynchronisation);
        mTextViewCurrentTime = findViewById(R.id.textViewCurrentTime);

        mTextViewCurrentTime.setText(getIntent().getStringExtra(CURRENT_DATE));
        
        mBtnStartSynchronisation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LOG_TAG, "Synchronisation -> btnStartSynchronisation -> onClick");
                Toast.makeText(getApplicationContext(), R.string.data_syncing_has_started,
                        Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),
                        R.string.synchronization_is_completed_successfully,
                        Toast.LENGTH_SHORT).show();

                postDelayed();
            }
        });
    }

    protected void postDelayed() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(LOG_TAG, "Synchronisation -> Handler().postDelayed -> finish()");
                finish();
            }
        }, 4000);
    }
}
