package com.example.irna.bookmemories.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.irna.bookmemories.Member;
import com.example.irna.bookmemories.R;
import com.github.chrisbanes.photoview.PhotoView;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
public class FotoFragment extends Fragment {
    private ImageButton img1,img2,img3,img4,img5,img6;
    private Member member;
    private Bundle bundle;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        member= (Member) bundle.getSerializable("mmmember");
    }

    public FotoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_foto, container, false);
        img1=(ImageButton) view.findViewById(R.id.img_1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder=new AlertDialog.Builder(getActivity());
                View view1=getLayoutInflater().inflate(R.layout.dialog_custom_layout,null);
                PhotoView photoView=view1.findViewById(R.id.imageview);
                Picasso.with(getContext()).load(member.getFoto1()).into(photoView);
                mBuilder.setView(view1);
                AlertDialog mDialog=mBuilder.create();
                mDialog.show();
            }
        });
        img2=(ImageButton) view.findViewById(R.id.img_2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder2=new AlertDialog.Builder(getActivity());
                View view1=getLayoutInflater().inflate(R.layout.dialog_custom_layout,null);
                PhotoView photoView=view1.findViewById(R.id.imageview);
                Picasso.with(getContext()).load(member.getFoto2()).into(photoView);
                mBuilder2.setView(view1);
                AlertDialog mDialog=mBuilder2.create();
                mDialog.show();
            }
        });
        img3=(ImageButton) view.findViewById(R.id.img_3);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder3=new AlertDialog.Builder(getActivity());
                View view1=getLayoutInflater().inflate(R.layout.dialog_custom_layout,null);
                PhotoView photoView=view1.findViewById(R.id.imageview);
                Picasso.with(getContext()).load(member.getFoto3()).into(photoView);
                mBuilder3.setView(view1);
                AlertDialog mDialog=mBuilder3.create();
                mDialog.show();
            }
        });
        img4=(ImageButton) view.findViewById(R.id.img_4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder4=new AlertDialog.Builder(getActivity());
                View view1=getLayoutInflater().inflate(R.layout.dialog_custom_layout,null);
                PhotoView photoView=view1.findViewById(R.id.imageview);
                Picasso.with(getContext()).load(member.getFoto4()).into(photoView);
                mBuilder4.setView(view1);
                AlertDialog mDialog=mBuilder4.create();
                mDialog.show();
            }
        });
        img5=(ImageButton) view.findViewById(R.id.img_5);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder5=new AlertDialog.Builder(getActivity());
                View view1=getLayoutInflater().inflate(R.layout.dialog_custom_layout,null);
                PhotoView photoView=view1.findViewById(R.id.imageview);
                Picasso.with(getContext()).load(member.getFoto5()).into(photoView);
                mBuilder5.setView(view1);
                AlertDialog mDialog=mBuilder5.create();
                mDialog.show();
            }
        });
        img6=(ImageButton) view.findViewById(R.id.img_6);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder6=new AlertDialog.Builder(getActivity());
                View view1=getLayoutInflater().inflate(R.layout.dialog_custom_layout,null);
                PhotoView photoView=view1.findViewById(R.id.imageview);
                Picasso.with(getContext()).load(member.getFoto6()).into(photoView);
                mBuilder6.setView(view1);
                AlertDialog mDialog=mBuilder6.create();
                mDialog.show();
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Picasso.with(getContext()).load(member.getFoto1()).into(img1);
        Picasso.with(getContext()).load(member.getFoto2()).into(img2);
        Picasso.with(getContext()).load(member.getFoto3()).into(img3);
        Picasso.with(getContext()).load(member.getFoto4()).into(img4);
        Picasso.with(getContext()).load(member.getFoto5()).into(img5);
        Picasso.with(getContext()).load(member.getFoto6()).into(img6);
    }

}
