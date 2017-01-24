package com.parking.parkingdude.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.parking.parkingdude.R;
import com.parking.parkingdude.fragment.FragmentWelcomServ;
import com.parking.parkingdude.fragment.FragmentWelcomeInf;
import com.parking.parkingdude.fragment.FragmentWelcomeValet;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

/**
 * Created by root on 1/17/17.
 */

public class IndicatorActivity extends AppCompatActivity {

    ViewPager pager;
    CircleIndicator indicator;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.indicator_activity);
        pager = (ViewPager) findViewById(R.id.pager);
        indicator = (CircleIndicator) findViewById(R.id.indicator);
        List<Fragment> list = new ArrayList<>();

        FragmentWelcomeInf fragmentWelcomeInf = new FragmentWelcomeInf();
        FragmentWelcomServ fragmentWelcomeServ = new FragmentWelcomServ();
        FragmentWelcomeValet fragmentWelcomeValet = new FragmentWelcomeValet();

        list.add(fragmentWelcomeInf);
        list.add(fragmentWelcomeServ);
        list.add(fragmentWelcomeValet);

        Bundle bundle = new Bundle();
        //  bundle.putString("id1", getResources().getString(R.string.about_parking_spots));

        fragmentWelcomeInf.setArguments(bundle);


        Bundle bundle1 = new Bundle();
        // bundle.putString("id1", getResources().getString(R.string.order_service_parking));
        fragmentWelcomeServ.setArguments(bundle1);
        ;

        Bundle bundle3 = new Bundle();
        // bundle.putString("id1", getResources().getString(R.string.see_request_time));
        fragmentWelcomeServ.setArguments(bundle3);


        pager.setAdapter(new ParkingAdapter(list));
        indicator.setViewPager(pager);


    }

    private class ParkingAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragmentList;


        public ParkingAdapter(List<Fragment> fragmentList) {
            super(getSupportFragmentManager());
            this.fragmentList = fragmentList;
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "Kol";
        }
    }
}
