package com.example.lv1;

import com.google.gson.annotations.SerializedName;

public class Courses {
    @SerializedName("title")
    private String superTitle;

    public Courses(String title) {
        this.superTitle = title;
    }

    public String getTitle() {
        return superTitle;
    }
}