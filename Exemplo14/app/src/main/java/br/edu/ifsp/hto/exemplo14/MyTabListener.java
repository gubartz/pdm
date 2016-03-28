package br.edu.ifsp.hto.exemplo14;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;

/**
 * Created by gustavohome on 27/03/2016.
 */
public class MyTabListener implements ActionBar.TabListener{
    private Context context;
    private Fragment fragment;

    public MyTabListener(Context context, Fragment fragment) {
        this.context  = context;
        this.fragment = fragment;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.layoutFrag, this.fragment, null);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
