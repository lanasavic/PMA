package com.example.lv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_home);

        Student student = (Student)getIntent().getSerializableExtra("student");

        ArrayList<Student> studentiSingleton = (ArrayList<Student>) StudentList.getInstance().ReturnList();

        List<Object> myDataSet = new ArrayList<>();
        myDataSet.add("Studenti:");
        myDataSet.addAll(studentiSingleton);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new myRecyclerAdapter(myDataSet);
        mRecyclerView.setAdapter(mAdapter);

        btnHome = (Button) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CreateNewRecordActivity.class); //PersonalInfoActivity
                startActivity(intent);
                finish();
            }
        });
    }
}