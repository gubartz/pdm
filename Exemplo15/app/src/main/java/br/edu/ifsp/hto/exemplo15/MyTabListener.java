package br.edu.ifsp.hto.exemplo15;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;

/**
 * Created by gustavohome on 27/03/2016.
 */
public class MyTabListener implements ActionBar.TabListener{
    private ViewPager viewPager;
    private int position;

    public MyTabListener(ViewPager viewPager, int position) {
        this.viewPager = viewPager;
        this.position  = position;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(position);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
