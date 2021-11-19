package com.example.planszowki;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PlanszowkaDao {

    @Delete
    void usunPlanszowki(List<Planszowka> gry);

    @Insert
    void wstawPlanszowke(Planszowka gra);

    @Insert
    void wstawListePlanszowek(List<Planszowka> gry);

    @Query("SELECT * FROM planszowki")
    LiveData<List<Planszowka>> wszystkiePlanszowki();

    @Query("SELECT * FROM planszowki WHERE wiek<=:w")
    LiveData<List<Planszowka>> planszowkiWgWieku(int w);

    @Query("SELECT * FROM planszowki WHERE minLiczbaOsob<=:l AND maxLiczbaOsob>=:l")
    LiveData<List<Planszowka>>planszowkiWgLiczbyGraczy(int l);
}
