package com.example.irna.bookmemories;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.irna.bookmemories.adapter.TabFragmentPagerAdapter;

public class DetailActivity extends AppCompatActivity {
    public static String KEY_ACTIVITY = "msg_activity";
    private Member kenangan;
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    TabFragmentPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);


        Intent i = getIntent();
        kenangan = (Member) i.getSerializableExtra(KEY_ACTIVITY);
        getSupportActionBar().setTitle("Album Kenangan " + kenangan.getNama());

        viewPager = (ViewPager) findViewById(R.id.pager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        pagerAdapter = new TabFragmentPagerAdapter(getSupportFragmentManager(), kenangan);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark), getResources().getColor(R.color.colorWhite));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }

}
