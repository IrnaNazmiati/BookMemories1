package com.example.irna.bookmemories.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.irna.bookmemories.Member;
import com.example.irna.bookmemories.fragment.DataFragment;
import com.example.irna.bookmemories.fragment.FotoFragment;
import com.example.irna.bookmemories.fragment.KesanFragment;

import java.io.Serializable;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    private Member membernya;
    String [] title = new String[]{"Data Diri","Kesan Pesan", "Foto"};

    public TabFragmentPagerAdapter(FragmentManager fm, Member membernya) {
        super(fm);
        this.membernya=membernya;

    }
    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                Fragment fragment= new DataFragment();
                Bundle bundle=new Bundle();
                bundle.putSerializable("member", (Serializable) membernya);
                fragment.setArguments(bundle);
                return fragment;

            case 1:
                Fragment fragment2= new KesanFragment();
                Bundle bundle2=new Bundle();
                bundle2.putSerializable("mmember", (Serializable) membernya);
                fragment2.setArguments(bundle2);
                return fragment2;

            case 2:
                Fragment fragment3= new FotoFragment();
                Bundle bundle3=new Bundle();
                bundle3.putSerializable("mmmember", (Serializable) membernya);
                fragment3.setArguments(bundle3);
                return fragment3;

        }
        return null;
    }

    @Override
    public int getCount() {
        return title.length;
    }


    public CharSequence getPageTitle  (int position){
        return title[position];
    }

}
