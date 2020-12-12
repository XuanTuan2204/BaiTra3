package com.example.daikin_vietnam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Profile extends Fragment implements View.OnClickListener{

    Button btnsignup_151;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View r = inflater.inflate(R.layout.profile, container, false);

        btnsignup_151 = r.findViewById(R.id.btnsignup_151);
        btnsignup_151.setOnClickListener(this);
        return r;
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnsignup_151) {
            Intent dsp = new Intent(Profile.this.getActivity(), Login.class);
            startActivity(dsp);
        }
    }
}
