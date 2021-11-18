package com.example.planszowki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private PlanszowkiViewModel planszowkiViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        planszowkiViewModel = new ViewModelProvider(this,
                new ViewModelProvider
                        .AndroidViewModelFactory(getApplication()))
                .get(PlanszowkiViewModel.class);
    }
}