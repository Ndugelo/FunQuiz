package com.example.admin.funquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.os.Build.VERSION_CODES.M;

public class TopicsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics_page);
    }

    public void topic1(View view) {
        Intent objIntent = new Intent(TopicsPage.this, TopicOne.class);
        startActivity(objIntent);

    }
    public void topic2(View view) {
        Intent objIntent = new Intent(TopicsPage.this, TopicTwo.class);
        startActivity(objIntent);

    }
    public void topic3(View view) {
        Intent objIntent = new Intent(TopicsPage.this, TopicThree.class);
        startActivity(objIntent);

    }
}
