package com.example.charl.snackbar;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String tvValue;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvValue = "This is a value";
        tv = findViewById(R.id.tv);
        tv.setText(tvValue);

    }

    public void clearText(View view) {
        tv.setText("");
        Snackbar.make(view, "This is a snackbar", Snackbar.LENGTH_LONG)
                .setAction("UNDO", new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        tv.setText(tvValue);
                    }
                })
                .setActionTextColor(Color.RED)
                .show();
    }
}
