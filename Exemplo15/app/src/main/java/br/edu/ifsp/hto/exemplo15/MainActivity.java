package br.edu.ifsp.hto.exemplo15;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new TabsAdapter(getSupportFragmentManager()));

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Deprecated, apenas para fins pedagógicos
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        //Tab1
        ActionBar.Tab tab1 = actionBar.newTab().setText("Frag 1");
        tab1.setTabListener(new MyTabListener(viewPager, 0));
        actionBar.addTab(tab1);

        //Tab2
        ActionBar.Tab tab2 = actionBar.newTab().setText("Frag 2");
        tab2.setTabListener(new MyTabListener(viewPager, 1));
        actionBar.addTab(tab2);

        //Tab3
        ActionBar.Tab tab3 = actionBar.newTab().setText("Frag 3");
        tab3.setTabListener(new MyTabListener(viewPager, 2));
        actionBar.addTab(tab3);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
