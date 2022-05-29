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

        mPersonNameTextView = (TextView) findViewById(R.id.personNameTextView);
        mYourLocationTextView = (TextView) findViewById(R.id.yourLocationTextView);
        mItemSizeTextView = (TextView) findViewById(R.id.itemSizeTextView);
        mWhereToTextView = (TextView) findViewById(R.id.whereToTextView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String location = intent.getStringExtra("location");
        String size = intent.getStringExtra("size");
        String destination = intent.getStringExtra("destination");
        mPersonNameTextView.setText("Your name: " + name);
        mYourLocationTextView.setText("Your Location: " + location);
        mItemSizeTextView.setText("Item Size: " + size);
        mWhereToTextView.setText("Destination: " + destination);
    }
}