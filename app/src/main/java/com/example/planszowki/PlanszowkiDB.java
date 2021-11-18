package com.example.planszowki;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Planszowka.class}, exportSchema = false, version = 1)
public abstract class PlanszowkiDB extends RoomDatabase {

    private static final String DB_NAME = "planszowki_db";


}
