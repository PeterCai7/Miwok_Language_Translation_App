package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NumbersTranslationActivity extends AppCompatActivity {
    private final static String LOG_TAG = "NumbersTransActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_translation);

        String[] wordsArray = {"one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten"};
        ArrayList<String> words = new ArrayList<>(Arrays.asList(wordsArray));

        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //using a while loop to add wordViews repetitively
        //discard this method due to limited memory
        /*Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()) {
            TextView wordView = new TextView(this);
            wordView.setText(iterator.next());
            rootView.addView(wordView);
        }*/
        ArrayAdapter<String> itemsAdaptor = new ArrayAdapter<>(this, R.layout.words_list_item, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdaptor);

    }
}