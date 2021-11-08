package com.example.lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StudentInfoActivity extends AppCompatActivity {
    private EditText oImeProf;
    private EditText oPrezimeProf;
    private EditText oAkGod;
    private EditText oBrPred;
    private EditText oBrLV;
    private String fwdIme;
    private String fwdPrezime;
    private String fwdDatum;
    private String newImeProf;
    private String newPrezimeProf;
    private String newAkGod;
    private String newBrPred;
    private String newBrLV;
    private Button btnDalje2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);
        final Bundle oExtras = getIntent().getExtras();
        fwdIme = oExtras.getString("Ime");
        fwdPrezime = oExtras.getString("Prezime");
        fwdDatum = oExtras.getString("Datum");

        oImeProf = (EditText) findViewById(R.id.inptImeProf);
        oPrezimeProf = (EditText) findViewById(R.id.inptPrezimeProf);
        oAkGod = (EditText) findViewById(R.id.inptAkGod);
        oBrPred = (EditText) findViewById(R.id.inptBrPred);
        oBrLV = (EditText) findViewById(R.id.inptBrLV);
        btnDalje2 = (Button) findViewById(R.id.btnDalje2);

        btnDalje2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newImeProf = oImeProf.getText().toString();
                newPrezimeProf = oPrezimeProf.getText().toString();
                newAkGod = oAkGod.getText().toString();
                newBrPred = oBrPred.getText().toString();
                newBrLV = oBrLV.getText().toString();
                Intent intent2 = new Intent(getApplicationContext(), SummaryActivity.class);
                intent2.putExtra("Ime", fwdIme);
                intent2.putExtra("Prezime", fwdPrezime);
                intent2.putExtra("Datum", fwdDatum);
                intent2.putExtra("ImeProf", newImeProf);
                intent2.putExtra("PrezimeProf", newPrezimeProf);
                intent2.putExtra("AkGod", newAkGod);
                intent2.putExtra("BrPred", newBrPred);
                intent2.putExtra("BrLV", newBrLV);
                startActivity(intent2);
                finish();
            }
        });
    }
}