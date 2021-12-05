package com.example.lv1;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.lv1.databinding.ActivityCoursesBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CoursesActivity extends AppCompatActivity  implements Callback<ArrayList<Course>> {
    ArrayList<Course> courses = new ArrayList<>();
    TextView tvCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_courses); -->postavlja activity_courses.xml kao pocetni zaslon
        tvCourse = findViewById(R.id.tvCourse);
        ApiManager.getInstance().service().getCourses().enqueue(this); //asinkroni poziv
    }
    @Override
    public void onResponse(@NonNull Call<ArrayList<Course>> call, @NonNull
            Response<ArrayList<Course>> response) {
        if (response.isSuccessful() && response.body() != null){
            courses.addAll(response.body());
            setCourses(courses);
        }
    }
    @Override
    public void onFailure(Call<ArrayList<Course>> call, Throwable t) {
        //t.printStackTrace();
        Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
    }
    private void setCourses(ArrayList<Course> courses){
        tvCourse.setText(courses.toString());  //needs spinner
    }
}

/* https://www.section.io/engineering-education/making-api-requests-using-retrofit-android/

ListView superListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        superListView = findViewById(R.id.superListView);

        getCourses();
    }

    private void getCourses() {
        Call<List<Courses>> call = RetrofitClient.getInstance().getMyApi().getCourses();
        call.enqueue(new Callback<List<Courses>>() {
            @Override
            public void onResponse(Call<List<Courses>> call, Response<List<Courses>> response) {
                List<Courses> myCourseList = response.body();
                String[] oneCourse = new String[myCourseList.size()];

                for (int i = 0; i < myCourseList.size(); i++) {
                    oneCourse[i] = myCourseList.get(i).getTitle();
                }
                superListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, oneCourse));
            }

            @Override
            public void onFailure(Call<List<Courses>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
            }
        });
    }*/