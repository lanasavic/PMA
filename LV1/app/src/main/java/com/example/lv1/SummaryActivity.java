package com.example.lv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    private TextView oPredmet;
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
        fwdPredmet = oExtras.getString("Predmet");
        fwdImeProf = oExtras.getString("ImeProf");
        fwdPrezimeProf = oExtras.getString("PrezimeProf");
        fwdAkGod = oExtras.getString("AkGod");
        fwdBrPred = oExtras.getString("BrPred");
        fwdBrLV = oExtras.getString("BrLV");

        btnKraj = (Button) findViewById(R.id.btnFinito);

        oIme = (TextView)findViewById(R.id.frgm_txtIme);
        oIme.setText(fwdIme);
        oPrezime = (TextView)findViewById(R.id.frgm_txtPrezime);
        oPrezime.setText(fwdPrezime);
        oDatum = (TextView)findViewById(R.id.frgm_txtDatum);
        oDatum.setText(fwdDatum);
        oPredmet = (TextView)findViewById(R.id.frgm_txtPredmet);
        oPredmet.setText(fwdPredmet);
        oImeProf = (TextView)findViewById(R.id.frgm_txtImeProf);
        oImeProf.setText(fwdImeProf);
        oPrezimeProf = (TextView)findViewById(R.id.frgm_txtPrezProf);
        oPrezimeProf.setText(fwdPrezimeProf);
        oAkGod = (TextView)findViewById(R.id.frgm_txtAkGod);
        oAkGod.setText(fwdAkGod);
        oBrPred = (TextView)findViewById(R.id.frgm_txtBrPred);
        oBrPred.setText(fwdBrPred);
        oBrLV = (TextView)findViewById(R.id.frgm_txtBrLV);
        oBrLV.setText(fwdBrLV);

        btnKraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oFinishIntent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(oFinishIntent);
                finish();
            }
        });
    }
}