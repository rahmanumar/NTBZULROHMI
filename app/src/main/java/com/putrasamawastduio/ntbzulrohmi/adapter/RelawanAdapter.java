package com.putrasamawastduio.ntbzulrohmi.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.putrasamawastduio.ntbzulrohmi.fragment.Pengumuman;
import com.putrasamawastduio.ntbzulrohmi.fragment.ProfilFragment;
import com.putrasamawastduio.ntbzulrohmi.fragment.ProkerFragment;
import com.putrasamawastduio.ntbzulrohmi.fragment.VisiMisiFragment;

/**
 * Created by hp1 on 21-01-2015.
 */
public class RelawanAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public RelawanAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
//        switch (position) {
//
//            case 0:
//                ProfilFragment tab1 = new ProfilFragment();
//                return tab1;
//            case 1:
//                VisiMisiFragment tab2 = new VisiMisiFragment();
//                return tab2;
//            case 3:
//                ProkerFragment tab3 = new ProkerFragment();
//                return tab3;
//
//        }

        if(position == 0) // if the position is 0 we are returning the First tab
        {
            ProkerFragment tab1 = new ProkerFragment();
            return tab1;
        }

        else             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            ProkerFragment tab2 = new ProkerFragment();
            return tab2;
        }

    }


    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}