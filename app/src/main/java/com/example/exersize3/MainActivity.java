package com.example.exersize3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
    }
    public void pressed(View view) {
        counter++;
        btn.setText("perss: "+counter);
        if(counter % 7 == 0)
        {
            btn.setText("BOOM");
        }
    }
}