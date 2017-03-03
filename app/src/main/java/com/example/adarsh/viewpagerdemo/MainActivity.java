package com.example.adarsh.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   // private DrawerLayout mdrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager=(ViewPager)findViewById(R.id.pager);
      //  mdrawerLayout=(DrawerLayout)findViewById(R.id.draw_layout);
        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
    }
}
