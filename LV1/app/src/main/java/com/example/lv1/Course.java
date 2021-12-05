package com.example.lv1;

import androidx.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

public class Course {
    private String uuid;
    @SerializedName("title")
    private String title;
    //Namjerno izostavljen parametar kako bi se pokazalo da objekt ne mora sadržavati sve property-e koji su dostupni u JSON-u.
    //String normalizedJobTitle;

    public Course(String title) {
        this.title = title;
    }

    public String getUuid() {
        return uuid;
    }
    public String getTitle() {
        return title;
    }
    @NonNull
    @Override
    public String toString() {
        return title;
    }
}