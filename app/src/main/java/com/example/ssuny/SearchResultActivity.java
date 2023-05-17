package com.example.ssuny;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SearchResultActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_result);

        nameTextView = findViewById(R.id.medicine_name);
        descriptionTextView = findViewById(R.id.medicine_info);

        // 이름과 설명을 가져오는 로직
        String name = "타이레놀";
        String description = "두통약";

        // TextView에 이름과 설명 설정
        nameTextView.setText("Name: " + name);
        descriptionTextView.setText("Description: " + description);
    }
}
