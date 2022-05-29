package com.kemunto.ap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TrackingActivity extends AppCompatActivity {
    private Button mSubmitButton;
    private EditText mPersonNameEditText;
    private EditText mYourLocationEditText;
    private EditText mItemSizeEditText;
    private EditText mWhereToEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);
        mPersonNameEditText = (EditText) findViewById(R.id.personNameEditText);
        mYourLocationEditText = (EditText) findViewById(R.id.yourLocationEditText);
        mItemSizeEditText = (EditText) findViewById(R.id.itemSizeEditText);
        mWhereToEditText = (EditText) findViewById(R.id.whereToEditText);
        mSubmitButton = (Button) findViewById(R.id.submitButton);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mPersonNameEditText.getText().toString();
                String location = mYourLocationEditText.getText().toString();
                String size = mItemSizeEditText.getText().toString();
                String destination = mWhereToEditText.getText().toString();
                Intent intent = new Intent(TrackingActivity.this, InformationActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("location", location);
                intent.putExtra("size", size);
                intent.putExtra("destination", destination);
                startActivity(intent);
            }
        });
    }
}