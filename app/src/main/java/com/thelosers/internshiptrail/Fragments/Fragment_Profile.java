package com.thelosers.internshiptrail.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thelosers.internshiptrail.R;


public class Fragment_Profile extends Fragment {

    FragmentStatePagerAdapter adapterViewPager;
    ViewPager vpPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vpPager = (ViewPager) view.findViewById(R.id.viewPager);
        adapterViewPager = new MyPagerAdapter(getActivity().getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);


        PagerTabStrip mPagerTabStrip = (PagerTabStrip) view.findViewById(R.id.pgstrip);
        for (int i = 0; i < mPagerTabStrip.getChildCount(); ++i) {
            View nextChild = mPagerTabStrip.getChildAt(i);
            if (nextChild instanceof TextView) {
                TextView textViewToConvert = (TextView) nextChild;
                textViewToConvert.setTextColor(getResources().getColor(R.color.purple));
                textViewToConvert.setTextSize(16);

            }
        }
    }

    public class MyPagerAdapter extends FragmentStatePagerAdapter {
        private int NUM_ITEMS = 2;


        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }


        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return Fragment_About.newInstance();
                case 1:
                    return Fragment_review.newInstance();
                default:
                    return null;
            }
        }

//        @Override
//        public int getItemPosition(Object object) {
//            // POSITION_NONE makes it possible to reload the PagerAdapter
//            return POSITION_NONE;
//        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return "About";
                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return "Reviews";

                default:
                    return null;
            }

        }

    }

}
