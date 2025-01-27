package com.example.baitapnhomandroid.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.baitapnhomandroid.Fragment.HomeFragment;
import com.example.baitapnhomandroid.Fragment.ProfileFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new ProfileFragment();
            default:
                return new HomeFragment();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
