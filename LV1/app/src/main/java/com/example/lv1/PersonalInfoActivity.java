package com.example.lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersonalInfoActivity extends AppCompatActivity {
    private EditText oIme;
    private String newIme;
    private Button btnIme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        oIme = (EditText) findViewById(R.id.tvIme);
        btnIme = (Button) findViewById(R.id.btnIme);

        btnIme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newIme = oIme.getText().toString();
                Intent oImeIntent = new Intent(getApplicationContext(), StudentInfoActivity.class);
                oImeIntent.putExtra("Ime", newIme);
                startActivity(oImeIntent);
                finish();
            }
        });
    }
}