package com.example.planszowki;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "planszowki")
public class Planszowka {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo()
    private String nazwa;
    private int minLiczbaOsob;
    private int maxLiczbaOsob;
    private int czasGry;
    private int wiek;
    private double trudnosc;

    public Planszowka(String nazwa, int minLiczbaOsob, int maxLiczbaOsob, int czasGry, int wiek, double trudnosc) {
        this.nazwa = nazwa;
        this.minLiczbaOsob = minLiczbaOsob;
        this.maxLiczbaOsob = maxLiczbaOsob;
        this.czasGry = czasGry;
        this.wiek = wiek;
        this.trudnosc = trudnosc;
    }

    @Override
    public String toString() {
        return nazwa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getMinLiczbaOsob() {
        return minLiczbaOsob;
    }

    public void setMinLiczbaOsob(int minLiczbaOsob) {
        this.minLiczbaOsob = minLiczbaOsob;
    }

    public int getMaxLiczbaOsob() {
        return maxLiczbaOsob;
    }

    public void setMaxLiczbaOsob(int maxLiczbaOsob) {
        this.maxLiczbaOsob = maxLiczbaOsob;
    }

    public int getCzasGry() {
        return czasGry;
    }

    public void setCzasGry(int czasGry) {
        this.czasGry = czasGry;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public double getTrudnosc() {
        return trudnosc;
    }

    public void setTrudnosc(double trudnosc) {
        this.trudnosc = trudnosc;
    }
}
