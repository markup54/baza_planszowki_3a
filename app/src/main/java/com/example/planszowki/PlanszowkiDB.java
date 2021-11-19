package com.example.planszowki;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Planszowka.class}, exportSchema = false, version = 1)
public abstract class PlanszowkiDB extends RoomDatabase {

    private static final String DB_NAME = "planszowki_db";
    public abstract PlanszowkaDao planszowkaDao();

    private static volatile PlanszowkiDB instancja;

    public static final ExecutorService databaseWriterExecutor
            = Executors.newFixedThreadPool(2);

    public static PlanszowkiDB pobierzDB(final Context context){
        if(instancja == null){
            synchronized (PlanszowkiDB.class){
                if(instancja == null){
                    instancja = Room.databaseBuilder(
                            context.getApplicationContext(),
                            PlanszowkiDB.class,
                            DB_NAME
                    ).build();
                }
            }
        }
        return instancja;
    }

}
