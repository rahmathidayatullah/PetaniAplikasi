package dev.edmt.petaniaplikasi;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class petani_pageone extends Fragment {

    private Button btntarikuang;
    private Button btnverifikasi;

    View view;

    public petani_pageone() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.petani_activity_pageone, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view=view;
        btntarikuang();
        btnverifikasi();


    }

    private void btntarikuang() {
        btntarikuang = (Button)view.findViewById(R.id.btntarikuang);
        btntarikuang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),petani_tarikuang.class);
                startActivity(intent);
            }
        });
    }

    private void btnverifikasi() {
        btnverifikasi = (Button)view.findViewById(R.id.btnverifikasi);
        btnverifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),petani_verifikasi.class);
                startActivity(intent);
            }
        });
    }


}
