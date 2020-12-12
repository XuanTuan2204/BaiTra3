package com.example.daikin_vietnam;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Home_Activity extends Fragment implements View.OnClickListener {
    Button baotri_151,suachua_151, fnshop_151, phukien_151, lienhe_151;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View r = inflater.inflate(R.layout.home, container, false);

        baotri_151 = r.findViewById(R.id.baotri_151);
        baotri_151.setOnClickListener(this);

        suachua_151 = r.findViewById(R.id.suachua_151);
        suachua_151.setOnClickListener(this);

        fnshop_151 = r.findViewById(R.id.fnshop_151);
        fnshop_151.setOnClickListener(this);

        phukien_151 = r.findViewById(R.id.phukien_151);
        phukien_151.setOnClickListener(this);

        lienhe_151 = r.findViewById(R.id.lienhe_151);
        lienhe_151.setOnClickListener(this);



        return r;
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.baotri_151) {
            Intent dsp = new Intent(Home_Activity.this.getActivity(), Dichvu_DaiKin.class);
            startActivity(dsp);
        }

        if (v.getId() == R.id.suachua_151) {
            Intent dsp = new Intent(Home_Activity.this.getActivity(), Dichvu_DaiKin.class);
            startActivity(dsp);
        }

        if (v.getId() == R.id.fnshop_151) {
            Intent dsp = new Intent(Home_Activity.this.getActivity(), Dichvu_DaiKin.class);
            startActivity(dsp);
        }

        if (v.getId() == R.id.phukien_151) {
            Intent dsp = new Intent(Home_Activity.this.getActivity(), Dichvu_DaiKin.class);
            startActivity(dsp);
        }

        if (v.getId() == R.id.lienhe_151) {
            Intent dsp = new Intent(Home_Activity.this.getActivity(), Dichvu_DaiKin.class);
            startActivity(dsp);
        }
    }
}