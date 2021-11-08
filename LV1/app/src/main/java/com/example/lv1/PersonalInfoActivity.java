package com.example.lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PersonalInfoActivity extends AppCompatActivity {
    private EditText oIme;
    private EditText oPrezime;
    private EditText oDatum;
    private String newIme;
    private String newPrezime;
    private String newDatum;
    private Button btnDalje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        oIme = (EditText) findViewById(R.id.inptIme);
        oPrezime = (EditText) findViewById(R.id.inptPrezime);
        oDatum = (EditText) findViewById(R.id.inptDatum);

        btnDalje = (Button) findViewById(R.id.btnDalje);

        btnDalje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newIme = oIme.getText().toString();
                newPrezime = oPrezime.getText().toString();
                newDatum = oDatum.getText().toString();
                Intent intent1 = new Intent(getApplicationContext(), StudentInfoActivity.class);
                intent1.putExtra("Ime", newIme);
                intent1.putExtra("Prezime", newPrezime);
                intent1.putExtra("Datum", newDatum);
                startActivity(intent1);
                finish();
            }
        });
    }
}