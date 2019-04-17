package com.example.walkthedog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int x = 0;
    public void walking(View view) {
        x++;
        if (x%2 == 0) {
            started();
        }
        else {
            ended();
        }
    }

    public void started() {
        String a = "You're on a walk!";
        String b = "I'm Done";
        display(a, b);
    }

    public void ended() {
        String a = "You've finished your walk!";
        String b = "Let's Go!";
        display(a, b);
    }

    public void display(String what, String whatnow) {
        TextView walkTextView = findViewById(R.id.walk_time_text);
        walkTextView.setText(what);
        TextView buttonTextView = findViewById(R.id.lets_go_button);
        buttonTextView.setText(whatnow);
    }
}
