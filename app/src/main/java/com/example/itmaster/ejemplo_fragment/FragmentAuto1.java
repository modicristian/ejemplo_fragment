package com.example.itmaster.ejemplo_fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class FragmentAuto1 extends Fragment {

    ImageView imagen;
    TextView txtmarca,txtmodelo,txtmotor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_auto1, container, false);

        imagen = getActivity().findViewById(R.id.imagen);

        txtmarca = getActivity().findViewById(R.id.txtMarca);
        txtmodelo = getActivity().findViewById(R.id.txtModelo);
        txtmotor = getActivity().findViewById(R.id.txtMotor);


    }

}
