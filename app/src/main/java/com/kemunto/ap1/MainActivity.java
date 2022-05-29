package com.kemunto.ap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.getTrackingButton)
    Button mGetTrackingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mGetTrackingButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mGetTrackingButton) {
            Toast.makeText(MainActivity.this, "Let's go!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, TrackingActivity.class);
            startActivity(intent);
        }
    }
}