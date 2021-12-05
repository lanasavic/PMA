package com.example.lv1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Dokumentacija: https://catalog-api.udacity.com/v1/courses
 */

public interface CoursesAPI {
    String BASE_URL = "https://catalog-api.udacity.com/";
    @GET("/v1/courses")
    Call<List<Courses>> getCourses();
}