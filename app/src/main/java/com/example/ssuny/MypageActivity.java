package com.example.ssuny;

import android.app.appsearch.SearchResult;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MypageActivity extends AppCompatActivity {

    private ListView listViewSearchHistory;
    private SearchResultAdapter searchHistoryAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage);

        Button to_alarm_btn = (Button) findViewById(R.id.to_alarm);
        to_alarm_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AlarmListActivity.class);
                startActivity(intent);
            }
        });
    }
}