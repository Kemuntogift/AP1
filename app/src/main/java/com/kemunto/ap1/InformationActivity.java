package com.kemunto.ap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {
    private TextView mPersonNameTextView;
    private TextView mYourLocationTextView;
    private TextView mItemSizeTextView;
    private TextView mWhereToTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
    }
}