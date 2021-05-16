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

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));

        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //using a while loop to add wordViews repetitively
        //discard this method due to limited memory
        /*Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()) {
            TextView wordView = new TextView(this);
            wordView.setText(iterator.next());
            rootView.addView(wordView);
        }*/
        WordAdapter itemsAdaptor = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdaptor);

    }
}