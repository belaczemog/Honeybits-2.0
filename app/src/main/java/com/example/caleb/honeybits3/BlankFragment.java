package com.example.caleb.honeybits3;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    View v;
    Button btn_login;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_blank, container, false);
        btn_login =  (Button) v.findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BlankFragment.this.getActivity(), Pop.class));
            }
        });

        // Inflate the layout for this fragment
        return v;


    }


}
