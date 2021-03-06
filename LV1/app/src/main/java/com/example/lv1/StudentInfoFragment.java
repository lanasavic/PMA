package com.example.lv1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StudentInfoFragment#//newInstance} factory method to
 * create an instance of this fragment.
 */
public class StudentInfoFragment extends Fragment {
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

    EditText inptPredmet, inptImeProf, inptPrezimeProf, inptAkGod, inptBrPred, inptBrLV;

    public StudentInfoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * //@param param1 Parameter 1.
     * //@param param2 Parameter 2.
     * @return A new instance of fragment StudentInfoFragment.
     */
    /*
    // TODO: Rename and change types and number of parameters
    public static StudentInfoFragment newInstance(String param1, String param2) {
        StudentInfoFragment fragment = new StudentInfoFragment();
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
    }
*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_student_info, container, false);

        inptPredmet = view.findViewById(R.id.inptPredmet);
        inptImeProf = view.findViewById(R.id.inptImeProf);
        inptPrezimeProf = view.findViewById(R.id.inptPrezimeProf);
        inptAkGod = view.findViewById(R.id.inptAkGod);
        inptBrPred = view.findViewById(R.id.inptBrPred);
        inptBrLV = view.findViewById(R.id.inptBrLV);

        inptPredmet.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fragmentListener.setPredmet(inptPredmet.getText().toString());
            }
        });

        inptImeProf.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fragmentListener.setProfesorIme(inptImeProf.getText().toString());
            }
        });

        inptPrezimeProf.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fragmentListener.setProfesorPrezime(inptPrezimeProf.getText().toString());
            }
        });

        inptAkGod.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fragmentListener.setGodina(inptAkGod.getText().toString());
            }
        });

        inptBrPred.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fragmentListener.setSatiPredavanja(inptBrPred.getText().toString());
            }
        });

        inptBrLV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                fragmentListener.setSatiLV(inptBrLV.getText().toString());
            }
        });
        return view;
    }
}