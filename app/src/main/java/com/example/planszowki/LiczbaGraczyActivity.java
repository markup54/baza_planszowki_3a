package com.example.planszowki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class LiczbaGraczyActivity extends AppCompatActivity {
    private Button button;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liczba_graczy);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinner = (Spinner) findViewById(R.id.spinner);
                int liczbaGraczy = Integer
                        .parseInt(spinner.getSelectedItem().toString());
                Log.d("gra",Integer.toString(liczbaGraczy));
            }
        });
    }
}