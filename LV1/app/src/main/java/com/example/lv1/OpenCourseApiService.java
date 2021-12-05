package com.example.lv1;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OpenCourseApiService {
    @GET("/v1/courses")
    Call<ArrayList<Course>> getCourses();
}