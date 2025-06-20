package com.smarteyes.ai;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String API_KEY = "sk-proj-..."; // Ganti dengan API key asli kamu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("Hello, SmartEyes!");
        setContentView(textView);
    }
}
