package com.example.lv1;

import android.graphics.Bitmap;

public interface FragmentListener {

    void setProfilna(Bitmap profilna);
    void setIme(String ime);
    void setPrezime(String prezime);
    void setDatum(String datum);
    void setPredmet(String predmet);
    void setProfesorIme(String profesorIme);
    void setProfesorPrezime(String profesorPrezime);
    void setGodina(String godina);
    void setSatiPredavanja(String satiPredavanja);
    void setSatiLV(String satiLV);

    Bitmap getProfilna();
    String getIme();
    String getPrezime();
    String getDatum();
    String getPredmet();
    String getProfesorIme();
    String getProfesorPrezime();
    String getGodina();
    String getSatiPredavanja();
    String getSatiLV();
}
