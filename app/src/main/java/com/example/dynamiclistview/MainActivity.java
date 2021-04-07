package com.example.dynamiclistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String[] WORDS = {
            "First",
            "Second",
            "Third",
            "SecondLast",
            "Last"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> myArray = new ArrayList<String>();
        for (int i = 0; i < WORDS.length; i++) {
            myArray.add(WORDS[i]);
        }
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArray);
        ListView list = (ListView)findViewById(R.id.listview);
        list.setAdapter(adp);

    }
}