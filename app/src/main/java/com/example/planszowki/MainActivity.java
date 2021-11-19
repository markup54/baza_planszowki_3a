package com.example.planszowki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
        planszowkiViewModel.pobierzPlanszowke().observe(
                this,planszowki -> {
                    ArrayAdapter<Planszowka> planszowkaArrayAdapter
                            = new ArrayAdapter<Planszowka>(
                                    this,
                            android.R.layout.simple_list_item_1,
                            planszowki
                    );
                    ListView listView
                            = (ListView) findViewById(R.id.listview);
                    listView.setAdapter(planszowkaArrayAdapter);
                }
        );
        planszowkiViewModel.usunPlanszowke();
        planszowkiViewModel.wstawPlanszowke(
                new Planszowka("Monopoly",
                        2,
                        5,
                        90,
                        6,
                        0.7));
        planszowkiViewModel.wstawPlanszowke(
                new Planszowka("Dungeons and dragon",
                        2,
                        5,
                        60,
                        12,
                        2.51));
        planszowkiViewModel.wstawPlanszowke(
                new Planszowka("Dixit",
                        3,
                        6,
                        30,
                        8,
                        1.21));
    }
}