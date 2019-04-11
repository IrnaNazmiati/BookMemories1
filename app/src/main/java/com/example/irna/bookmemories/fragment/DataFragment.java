package com.example.irna.bookmemories.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.irna.bookmemories.Member;
import com.example.irna.bookmemories.R;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
public class DataFragment extends Fragment {
    private TextView txtNama, alamat, desa, kec, kab, ttl, hobi;
    private ImageView imageView;
    private Member member;
    private Bundle bundle;


    public DataFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getArguments();
        member = (Member) bundle.getSerializable("member");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_data, container, false);
        txtNama = (TextView) view.findViewById(R.id.txt_nama_detail);
        alamat = (TextView) view.findViewById(R.id.txt_kampung);
        ttl = (TextView) view.findViewById(R.id.txt_ttl);
        desa = (TextView) view.findViewById(R.id.txt_desa);
        kec = (TextView) view.findViewById(R.id.txt_kec);
        kab = (TextView) view.findViewById(R.id.txt_kab);
        hobi = (TextView) view.findViewById(R.id.txt_hobi);
        imageView = (ImageView) view.findViewById(R.id.img_foto_detail);
        return view;
    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama.setText(member.getNama());
        alamat.setText(member.getAlamat());
        ttl.setText(member.getTtl());
        desa.setText(member.getDesa());
        kec.setText(member.getKec());
        kab.setText(member.getKab());
        hobi.setText(member.getHobi());
        ttl.setText(member.getTtl());
        Picasso.with(getContext()).load(member.getFoto4()).into(imageView);
    }

    }

