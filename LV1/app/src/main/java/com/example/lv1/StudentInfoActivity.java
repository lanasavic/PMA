package com.example.lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentInfoActivity extends AppCompatActivity {
    private EditText oPredmet;
    private String fwdIme;
    private String newPredmet;
    private Button btnPredmet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        final Bundle oExtras = getIntent().getExtras();
        fwdIme = oExtras.getString("Ime");
        oPredmet = (EditText) findViewById(R.id.tvPredmet);
        btnPredmet = (Button) findViewById(R.id.btnPotvrdi2);

        btnPredmet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newPredmet = oPredmet.getText().toString();
                Intent oPredmetIntent = new Intent(getApplicationContext(), SummaryActivity.class);
                oPredmetIntent.putExtra("Ime", fwdIme);
                oPredmetIntent.putExtra("Predmet", newPredmet);
                startActivity(oPredmetIntent);
                finish();
            }
        });
    }
}