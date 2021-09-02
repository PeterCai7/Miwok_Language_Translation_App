package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.miwok.fragments.ColorsFragment;
import com.example.android.miwok.fragments.FamiliesFragment;
import com.example.android.miwok.fragments.NumbersFragment;
import com.example.android.miwok.fragments.PhrasesFragment;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class MiwokFragmentPagerAdapter extends FragmentPagerAdapter {

    public MiwokFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if(position == 1) {
            return new FamiliesFragment();
        } else if(position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
