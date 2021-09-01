 package com.example.android.miwok.activities;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.miwok.R;
import com.example.android.miwok.Word;
import com.example.android.miwok.WordAdapter;

import java.util.ArrayList;

 public class NumbersTranslationActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


    }
    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

}