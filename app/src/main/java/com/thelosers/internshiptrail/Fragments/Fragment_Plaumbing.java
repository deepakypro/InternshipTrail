package com.thelosers.internshiptrail.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thelosers.internshiptrail.Adapter.FragmentOneAdapter;
import com.thelosers.internshiptrail.Model.Product;
import com.thelosers.internshiptrail.R;

import java.util.LinkedList;
import java.util.List;


public class Fragment_Plaumbing extends Fragment {

    List<Product> mList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mList = retrieveItem();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_frag_one);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(),
                DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(dividerItemDecoration);
        mRecyclerView.setHasFixedSize(true);

        if (mList.size() > 0 && !mList.isEmpty()) {
            FragmentOneAdapter mFragmentThreeAdapter = new FragmentOneAdapter(getActivity(), mList);
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
