package com.example.planszowki;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class PlanszowkiViewModel extends AndroidViewModel {

    private PlanszowkiRepository planszowkiRepository;
    private final LiveData<List<Planszowka>> planszowki;

    public PlanszowkiViewModel(@NonNull Application application) {
        super(application);
        planszowkiRepository = new PlanszowkiRepository(application);
        planszowki = planszowkiRepository.pobierzPlanszowki();
    }

    public LiveData<List<Planszowka>> pobierzPlanszowke(){
        return planszowki;
    }

    public void wstawPlanszowke(Planszowka planszowka){
        planszowkiRepository.wstawPlanszowki(planszowka);
    }

}
