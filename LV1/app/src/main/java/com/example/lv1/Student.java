package com.example.lv1;

import android.graphics.Bitmap;

import androidx.annotation.VisibleForTesting;

import java.io.Serializable;

public class Student implements Serializable, FragmentListener {
    private Bitmap Profilna;
    public String Ime;
    public String Prezime;
    private String Datum;
    public String Predmet;
    private String ProfesorIme;
    private String ProfesorPrezime;
    private String Godina;
    private String SatiPredavanja;
    private String SatiLV;

    public Student (String Ime, String Prezime, String Predmet){
        this.Ime = Ime;
        this.Prezime = Prezime;
        this.Predmet = Predmet;
    }

    public Student (){

    }

    public String vratiIme() {
        return this.Ime;
    }

    public String vratiPrezime() {
        return this.Prezime;
    }

    public String vratiPredmet() {
        return this.Predmet;
    }

    /*public String vratiStudenta() {
        return this.Ime + ' ' + this.Prezime;
    }
    public String vratiProfesora() {
        return this.ProfesorIme + ' ' + this.ProfesorPrezime;
    }*/

    //SET
    @Override
    public void setIme(String ime) {
        this.Ime = ime;
    }

    @Override
    public void setPrezime(String prezime) {
        this.Prezime = prezime;
    }

    @Override
    public void setDatum(String datum) {
        this.Datum = datum;
    }

    @Override
    public void setPredmet(String predmet) {
        this.Predmet = predmet;
    }

    @Override
    public void setProfesorIme(String profesorIme) {
        this.ProfesorIme = profesorIme;
    }

    @Override
    public void setProfesorPrezime(String profesorPrezime) { this.ProfesorPrezime = profesorPrezime; }

    @Override
    public void setGodina(String godina) {
        this.Godina = godina;
    }

    @Override
    public void setSatiPredavanja(String satiPredavanja) {
        this.SatiPredavanja = satiPredavanja;
    }

    @Override
    public void setSatiLV(String satiLV) {
        this.SatiLV = satiLV;
    }

    @Override
    public void setProfilna(Bitmap profilna) {
        this.Profilna = profilna;
    }

    //GET
    @Override
    public String getIme() {
        return this.Ime;
    }

    @Override
    public String getPrezime() {
        return this.Prezime;
    }

    @Override
    public String getDatum() {
        return this.Datum;
    }

    @Override
    public String getPredmet() {
        return this.Predmet;
    }

    @Override
    public String getProfesorIme() {
        return this.ProfesorIme;
    }

    @Override
    public String getProfesorPrezime() {
        return this.ProfesorPrezime;
    }

    @Override
    public String getGodina() {
        return this.Godina;
    }

    @Override
    public String getSatiPredavanja() {
        return this.SatiPredavanja;
    }

    @Override
    public String getSatiLV() {
        return this.SatiLV;
    }

    @Override
    public Bitmap getProfilna() {
        return this.Profilna;
    }
}