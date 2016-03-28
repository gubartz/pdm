package br.edu.ifsp.hto.exemplo16;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by gustavohome on 27/03/2016.
 */
public class MyPagerAdapter extends FragmentPagerAdapter{
    String[] tabs;

    public MyPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        tabs = context.getResources().getStringArray(R.array.tabs);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        Fragment1 fragment = Fragment1.getInstance(position);
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
