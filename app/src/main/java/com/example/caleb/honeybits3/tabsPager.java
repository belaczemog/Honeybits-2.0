package com.example.caleb.honeybits3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class tabsPager extends FragmentStatePagerAdapter {

    String [] titles=new String[]{"Your feed","HoneyBits Favorites"};

    public tabsPager(FragmentManager fm) {

        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position){
        return titles[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                BlankFragment blankFragment=new BlankFragment();
                return blankFragment;
            case 1:
                Blank2Fragment blank2Fragment=new Blank2Fragment();
                return blank2Fragment;
        }
        return null;

    }

    @Override
    public int getCount() {
        return 2;
    }
}
