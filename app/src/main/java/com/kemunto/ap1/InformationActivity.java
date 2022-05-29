package com.kemunto.ap1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class InformationActivity extends AppCompatActivity {
    private String[] dispatcher = new String[] {"Baraka Smith", "On His Way!",
            "5 Minutes Away" };

    private ListView mListView;
    private TextView mPersonNameTextView;
    private TextView mYourLocationTextView;
    private TextView mItemSizeTextView;
    private TextView mWhereToTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        mListView = (ListView) findViewById(R.id.listView);
        mPersonNameTextView = (TextView) findViewById(R.id.personNameTextView);
        mYourLocationTextView = (TextView) findViewById(R.id.yourLocationTextView);
        mItemSizeTextView = (TextView) findViewById(R.id.itemSizeTextView);
        mWhereToTextView = (TextView) findViewById(R.id.whereToTextView);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, dispatcher);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String dispatcher = ((TextView)view).getText().toString();
                Toast.makeText(InformationActivity.this, dispatcher, Toast.LENGTH_LONG).show();
            }
        });

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