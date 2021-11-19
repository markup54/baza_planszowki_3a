package com.example.planszowki;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class PlanszowkiRepository {

    private PlanszowkaDao planszowkaDao;
    private LiveData<List<Planszowka>> planszowki;

    public PlanszowkiRepository(Application application){
        PlanszowkiDB db = PlanszowkiDB.pobierzDB(application);
        planszowkaDao = db.planszowkaDao();
        planszowki = planszowkaDao.wszystkiePlanszowki();
    }

    LiveData<List<Planszowka>>pobierzPlanszowki(){
        return planszowki;
    }

    void wstawPlanszowki(Planszowka planszowka){
        PlanszowkiDB.databaseWriterExecutor.execute(()->{
            planszowkaDao.wstawPlanszowke(planszowka);
        });
    }
    void usunWszystkiePlanszowki(List<Planszowka> gry){
        PlanszowkiDB.databaseWriterExecutor.execute(()->{
            planszowkaDao.usunPlanszowki(gry);
        });
    }
}
