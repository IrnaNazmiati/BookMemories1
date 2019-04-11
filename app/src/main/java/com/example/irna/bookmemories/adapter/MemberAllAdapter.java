package com.example.irna.bookmemories.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.irna.bookmemories.DetailActivity;
import com.example.irna.bookmemories.Kenangan;
import com.example.irna.bookmemories.MainActivity;
import com.example.irna.bookmemories.Member;
import com.example.irna.bookmemories.R;
import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.List;

public class MemberAllAdapter extends RecyclerView.Adapter<MemberAllAdapter.MemberAllHolder> {
    private Kenangan kenanganss;
    private Activity activity;

    public MemberAllAdapter(Kenangan kenanganss, Activity activity) {
        this.kenanganss = kenanganss;
        this.activity = activity;
    }


    @NonNull
    @Override
    public MemberAllHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(activity).inflate(R.layout.rv_besar,viewGroup,false);
        return new MemberAllHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MemberAllHolder memberAllHolder, final int i) {
        memberAllHolder.namanya.setText(kenanganss.getKenangan().get(i).getNama());
        Picasso.with(activity).load(kenanganss.getKenangan().get(i).getFoto1()).into(memberAllHolder.fotonya);
        memberAllHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Member kenangan=kenanganss.getKenangan().get(i);
                Intent intent = new Intent(activity, DetailActivity.class);
                intent.putExtra(DetailActivity.KEY_ACTIVITY, (Serializable) kenangan);
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return kenanganss.getKenangan().size();
    }


    static class MemberAllHolder extends RecyclerView.ViewHolder {
        TextView namanya;
        ImageView fotonya;

        public MemberAllHolder(@NonNull View itemView) {
            super(itemView);
            namanya = (TextView) itemView.findViewById(R.id.txt_nama);
            fotonya = (ImageView) itemView.findViewById(R.id.img_foto);
        }
    }
}
