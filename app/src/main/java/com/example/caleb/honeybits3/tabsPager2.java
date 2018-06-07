package com.example.caleb.honeybits3;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class tabsPager2 extends FragmentStatePagerAdapter {

    String [] titles2=new String[]{"Your feed","HoneyBits Favorites"};

    public tabsPager2(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) { return titles2[position]; }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                Blank3Fragment blank3Fragment=new Blank3Fragment();
                return blank3Fragment;
            case 1:
                Blank4Fragment blank4Fragment=new Blank4Fragment();
                return blank4Fragment;
        }
        return null;
    }

    @Override
    public int getCount() { return 2; }
}
