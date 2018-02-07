package com.thelosers.internshiptrail.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thelosers.internshiptrail.Adapter.FragmentAboutAdapter;
import com.thelosers.internshiptrail.Model.Product;
import com.thelosers.internshiptrail.R;

import java.util.LinkedList;
import java.util.List;


public class Fragment_About extends Fragment {

    List<Product> mList;

    public static Fragment_About newInstance() {
        Fragment_About fragment = new Fragment_About();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mList = retrieveItem();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView_about);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);

        if (mList.size() > 0 && !mList.isEmpty()) {
            FragmentAboutAdapter mFragmentThreeAdapter = new FragmentAboutAdapter(getActivity(), mList);
            mRecyclerView.setAdapter(mFragmentThreeAdapter);
            mFragmentThreeAdapter.notifyDataSetChanged();
        }

    }

    private List<Product> retrieveItem() {
        List<Product> list = new LinkedList<Product>();
        list.add(new Product("Tap, Wash Basin and sink problem"));
        list.add(new Product("Bathroom Water Filters"));
        list.add(new Product("Bathroom fittings"));

        list.add(new Product("Bathroom Water Filters"));
        list.add(new Product("Blocks & leakages"));
        list.add(new Product("Water tank problem"));

        list.add(new Product("Tap, Wash Basin and sink problem"));
        list.add(new Product("Bathroom Water Filters"));
        list.add(new Product("Blocks & leakages"));

        list.add(new Product("Bathroom fittings"));

        list.add(new Product("Bathroom Water Filters"));

        return list;
    }


}
