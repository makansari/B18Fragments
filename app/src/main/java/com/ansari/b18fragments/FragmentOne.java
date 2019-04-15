package com.ansari.b18fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentOne extends Fragment {


    Button passDataButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one,container,false);

        passDataButton = view.findViewById(R.id.buttonPassData);
        passDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTwo fragmentTwo = new FragmentTwo();
                Bundle bundle = new Bundle();
                bundle.putString("key","Ansari");

                fragmentTwo.setArguments(bundle);

                getFragmentManager().beginTransaction().replace(R.id.mylayout,fragmentTwo).commit();



            }
        });
        return view;
    }
}
