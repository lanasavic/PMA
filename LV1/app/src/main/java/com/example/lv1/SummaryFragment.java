package com.example.lv1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SummaryFragment#//newInstance} factory method to
 * create an instance of this fragment.
 */
public class SummaryFragment extends Fragment {
/*
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
*/

    public FragmentListener fragmentListener;

    TextView frgm_txtIme, frgm_txtPrezime, frgm_txtDatum, frgm_txtPredmet, frgm_txtImeProf, frgm_txtPrezProf, frgm_txtAkGod, frgm_txtBrPred, frgm_txtBrLV;
    ImageView imgProfilna2;
    Button btnFinito;

    public SummaryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * //@param param1 Parameter 1.
     * //@param param2 Parameter 2.
     * @return A new instance of fragment SummaryFragment.
     */
    /*
    // TODO: Rename and change types and number of parameters
    public static SummaryFragment newInstance(String param1, String param2) {
        SummaryFragment fragment = new SummaryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_summary, container, false);

        frgm_txtIme = view.findViewById(R.id.frgm_txtIme);
        frgm_txtPrezime = view.findViewById(R.id.frgm_txtPrezime);
        frgm_txtDatum = view.findViewById(R.id.frgm_txtDatum);
        frgm_txtPredmet = view.findViewById(R.id.frgm_txtPredmet);
        frgm_txtImeProf = view.findViewById(R.id.frgm_txtImeProf);
        frgm_txtPrezProf = view.findViewById(R.id.frgm_txtPrezProf);
        frgm_txtAkGod = view.findViewById(R.id.frgm_txtAkGod);
        frgm_txtBrPred = view.findViewById(R.id.frgm_txtBrPred);
        frgm_txtBrLV = view.findViewById(R.id.frgm_txtBrLV);
        imgProfilna2 = view.findViewById(R.id.imgProfilna2);
        btnFinito = view.findViewById(R.id.btnFinito);

        btnFinito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), HomeActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                Student newStudent = new Student(
                        fragmentListener.getIme(),
                        fragmentListener.getPrezime(),
                        fragmentListener.getPredmet());
                StudentList studentList = StudentList.getInstance();
                studentList.AddStudent(newStudent);
                i.putExtra("student", newStudent);
                startActivity(i);
            }
        });
        return view;
    }

    @Override
    public void onResume(){
        super.onResume();

        if(fragmentListener != null) {
            frgm_txtIme.setText(fragmentListener.getIme());
            frgm_txtPrezime.setText(fragmentListener.getPrezime());
            frgm_txtDatum.setText(fragmentListener.getDatum());
            frgm_txtPredmet.setText(fragmentListener.getPredmet());
            frgm_txtAkGod.setText(fragmentListener.getGodina());
            frgm_txtImeProf.setText(fragmentListener.getProfesorIme());
            frgm_txtPrezProf.setText(fragmentListener.getProfesorPrezime());
            frgm_txtBrPred.setText(fragmentListener.getSatiPredavanja());
            frgm_txtBrLV.setText(fragmentListener.getSatiLV());
            imgProfilna2.setImageBitmap(fragmentListener.getProfilna());
        }
    }
}