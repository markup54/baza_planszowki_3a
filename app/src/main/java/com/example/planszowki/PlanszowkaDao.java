package com.example.planszowki;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PlanszowkaDao {
    @Insert
    void wstawPlanszowke(Planszowka gra);

    @Insert
    void wstawListePlanszowek(List<Planszowka> gry);

    @Query("SELECT * FROM planszowki")
    List<Planszowka> wszystkiePlanszowki();

    @Query("SELECT * FROM planszowki WHERE wiek<=:w")
    List<Planszowka> planszowkiWgWieku(int w);

    @Query("SELECT * FROM planszowki WHERE minLiczbaOsob<=:l AND maxLiczbaOsob>=:l")
    List<Planszowka> planszowkiWgLiczbyGraczy(int l);
}
