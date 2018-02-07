package com.thelosers.internshiptrail.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thelosers.internshiptrail.Adapter.FragmentThreeAdapter;
import com.thelosers.internshiptrail.Model.Product;
import com.thelosers.internshiptrail.R;

import java.util.LinkedList;
import java.util.List;


public class fragment_Home extends Fragment {

    List<Product> mList;
    private RecyclerView mRecyclerView;

    public fragment_Home() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mList = retrieveItem();

    }


    private List<Product> retrieveItem() {
        List<Product> list = new LinkedList<Product>();
        list.add(new Product("Beauty", R.drawable.ic_beauty));
        list.add(new Product("Home Care", R.drawable.ic_homecare));
        list.add(new Product("Pest Control", R.drawable.ic_pestcontrol));

        list.add(new Product("Car & Bike", R.drawable.ic_car));
        list.add(new Product("Computer", R.drawable.ic_computer));
        list.add(new Product("Electric", R.drawable.ic_electric));

        list.add(new Product("Health Care", R.drawable.ic_healthcare));
        list.add(new Product("Plumbing", R.drawable.ic_plumbing));
        list.add(new Product("Appliances", R.drawable.ic_appliances));

        list.add(new Product("Health Care", R.drawable.ic_healthcare));
        list.add(new Product("Plumbing", R.drawable.ic_plumbing));
        list.add(new Product("Appliances", R.drawable.ic_appliances));

        return list;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView_fragment);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), 3);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);

        if (mList.size() > 0 && !mList.isEmpty()) {
            FragmentThreeAdapter mFragmentThreeAdapter = new FragmentThreeAdapter(getActivity(), mList);
            mRecyclerView.setAdapter(mFragmentThreeAdapter);
            mFragmentThreeAdapter.notifyDataSetChanged();
        }

    }


}
