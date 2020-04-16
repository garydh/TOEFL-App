package com.example.gerdev.toefllearningapp.Model_Set_get;

import java.util.ArrayList;

public class NarasiReading {

    private int id_narasi;
    private String narasi;

    public ArrayList<SoalReading> getSoalReadingArraylist() {
        return SoalReadingArraylist;
    }

    public void setSoalReadingArraylist(ArrayList<SoalReading> SoalReadingArraylist) {
        this.SoalReadingArraylist = SoalReadingArraylist;
    }

    private ArrayList<SoalReading> SoalReadingArraylist;

    public int getId_narasi() {
        return id_narasi;
    }

    public void setId_narasi(int id_narasi) {
        this.id_narasi = id_narasi;
    }

    public String getNarasi() {
        return narasi;
    }

    public void setNarasi(String narasi) {
        this.narasi = narasi;
    }
}
