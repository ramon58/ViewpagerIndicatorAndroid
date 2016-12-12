package com.rama.viewpagerindicator;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;

/**
 * Created by Ramon on 12/12/2016.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Context _context;
    public static int totalPage = 3;

    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        _context = context;

    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = new Fragment();
        switch (position) {
            case 0:
                f = new FragmentOne();
                break;
            case 1:
                f = new FragmentTwo();
                break;
            case 2:
                f = new FragmentThree();
                break;
        }
        return f;
    }

    @Override
    public int getCount() {
        return totalPage;
    }

}

