package com.kemunto.ap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TrackingActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.submitButton) Button mSubmitButton;
    @BindView(R.id.personNameEditText) EditText mPersonNameEditText;
    @BindView(R.id.yourLocationEditText) EditText mYourLocationEditText;
    @BindView(R.id.itemSizeEditText) EditText mItemSizeEditText;
    @BindView(R.id.whereToEditText) EditText mWhereToEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);
        ButterKnife.bind(this);

        mSubmitButton.setOnClickListener(this);
    }
            @Override
            public void onClick(View v) {
                if(v == mSubmitButton) {
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

    }
}