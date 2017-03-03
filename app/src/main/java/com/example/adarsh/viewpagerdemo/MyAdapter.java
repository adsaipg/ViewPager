package com.example.adarsh.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by adaRSH on 19-Sep-16.
 */
public class MyAdapter extends FragmentStatePagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position % 2==0) {

            fragmentOne fragment = fragmentOne.newInstance(position);
            return fragment;
        }
            else{

                fragmentTwo frag = fragmentTwo.newInstance(position);
                return frag;


            }
        }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "tab "+position;
    }
}
