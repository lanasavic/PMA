package com.example.lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {
    private String fwdIme;
    private String fwdPredmet;
    private Button btnKraj;
    private TextView oIme;
    private TextView oPredmet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        final Bundle oExtras = getIntent().getExtras();
        fwdIme = oExtras.getString("Ime");
        fwdPredmet = oExtras.getString("Predmet");
        btnKraj = (Button) findViewById(R.id.btnKraj);

        oIme = (TextView)findViewById(R.id.textIme);
        oIme.setText(fwdIme);

        oPredmet = (TextView)findViewById(R.id.textPredmet);
        oPredmet.setText(fwdPredmet);

        btnKraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oIzlazIntent = new Intent(getApplicationContext(), PersonalInfoActivity.class);
                startActivity(oIzlazIntent);
                finish();
            }
        });
    }
}