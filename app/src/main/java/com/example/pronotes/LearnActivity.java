package com.example.pronotes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LearnActivity extends AppCompatActivity {

    public final static String KEY_LEARN = "KEY LEARN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        String title = getResources().getString(R.string.learn);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(title.substring(0, 1).toUpperCase()+title.substring(1));
    }

    public void languageChoice(View view) {
        Intent intent = new Intent(getApplicationContext(), LanguageActivity.class);
        intent.putExtra(KEY_LEARN, view.getContentDescription());
        startActivity(intent);
    }

}
