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
    private String fwdPrezime;
    private String fwdDatum;
    private String fwdPredmet;
    private String fwdImeProf;
    private String fwdPrezimeProf;
    private String fwdAkGod;
    private String fwdBrPred;
    private String fwdBrLV;
    private Button btnKraj;
    private TextView oIme;
    private TextView oPrezime;
    private TextView oDatum;
    private TextView oImeProf;
    private TextView oPrezimeProf;
    private TextView oAkGod;
    private TextView oBrPred;
    private TextView oBrLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        final Bundle oExtras = getIntent().getExtras();
        fwdIme = oExtras.getString("Ime");
        fwdPrezime = oExtras.getString("Prezime");
        fwdDatum = oExtras.getString("Datum");
        fwdImeProf = oExtras.getString("ImeProf");
        fwdPrezimeProf = oExtras.getString("PrezimeProf");
        fwdAkGod = oExtras.getString("AkGod");
        fwdBrPred = oExtras.getString("BrPred");
        fwdBrLV = oExtras.getString("BrLV");

        btnKraj = (Button) findViewById(R.id.btnKraj);

        oIme = (TextView)findViewById(R.id.tvfwdIme);
        oIme.setText(fwdIme);
        oPrezime = (TextView)findViewById(R.id.tvfwdPrezime);
        oPrezime.setText(fwdPrezime);
        oDatum = (TextView)findViewById(R.id.tvfwdDatum);
        oDatum.setText(fwdDatum);
        oImeProf = (TextView)findViewById(R.id.tvfwdImeProf);
        oImeProf.setText(fwdImeProf);
        oPrezimeProf = (TextView)findViewById(R.id.tvfwdPrezimeProf);
        oPrezimeProf.setText(fwdPrezimeProf);
        oAkGod = (TextView)findViewById(R.id.tvfwdAkGod);
        oAkGod.setText(fwdAkGod);
        oBrPred = (TextView)findViewById(R.id.tvfwdBrPred);
        oBrPred.setText(fwdBrPred);
        oBrLV = (TextView)findViewById(R.id.tvfwdBrLV);
        oBrLV.setText(fwdBrLV);

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